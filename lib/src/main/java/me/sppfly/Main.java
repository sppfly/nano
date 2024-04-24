package me.sppfly;

import me.sppfly.stream.Topology;
import me.sppfly.operator.BaseSink;
import me.sppfly.operator.TextSource;

public class Main {
	public static void main(String[] args) {

		Topology topology = new Topology();
		topology.addSource(new TextSource("source", 0));
		topology.addSink(new BaseSink<>("sink", 1, System.out::println));

		var nanoStream = new NanoStream(topology);
		nanoStream.run();
		nanoStream.stop();
	}
}
