package me.sppfly;

import java.util.List;

import me.sppfly.operator.base.Node;
import me.sppfly.stream.Topology;

public class NanoStream {

	private Topology topology;

	private List<Node> nodes;

	private List<NanoThread> nanoThreads;

	public NanoStream(Topology topology) {
		this.topology = topology;
		nodes.add(this.topology.getSource());
		nodes.add(this.topology.getSink());
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
