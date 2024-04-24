package me.sppfly.stream;

import me.sppfly.operator.Sink;
import me.sppfly.operator.Source;

/**
 * Topology is a graph of streams, it is the same thing as Topology in Kafka or
 * StreamGraph in Flink.
 */
public class Topology {

	private Source<String> source;

	private Sink<String> sink;

	public void addSource(Source<String> source) {
		this.source = source;
	}

	public void addSink(Sink<String> sink) {
		this.sink = sink;
	}

	public void connect() {
		BlockStream<String> blockStream = new BlockStream<>(100);
		source.addOutput(blockStream);
		sink.addInput(blockStream);
	}
}
