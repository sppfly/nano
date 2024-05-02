package me.sppfly;

import java.util.List;

import me.sppfly.operator.Operator;
import me.sppfly.stream.Topology;

public class NanoStream {

	private Topology topology;

	private List<Operator<?, ?>> operators;

	public NanoStream(Topology topology) {
		this.topology = topology;
	}

	void run() {
		for (var operator: operators) {
			operator.run();	
		}

	}

	void stop() {

	}
}
