package me.sppfly;

import java.util.ArrayList;
import java.util.List;

import me.sppfly.operator.base.Node;
import me.sppfly.stream.Topology;

public class NanoStream {

	private Topology topology;

	private List<Node> nodes;

	private List<NanoThread> nanoThreads;

	public NanoStream(Topology topology) {
		this.topology = topology;
		this.nodes = new ArrayList<>();
		this.nanoThreads = new ArrayList<>();

		this.topology.getSources().forEach(source -> nodes.add(source));
		this.topology.getSinks().forEach(sink -> nodes.add(sink));
	}

	public void run() {
		for (var operator : nodes) {
			var nanoThread = new NanoThread(operator);
			nanoThreads.add(nanoThread);
			nanoThread.start();
		}
	}

	public void stop() {
		for (var nanoThread : nanoThreads) {
			nanoThread.interrupt();
		}
	}
}
