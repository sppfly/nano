package me.sppfly.stream;

import java.util.ArrayList;
import java.util.List;

import me.sppfly.operator.base.Operator1In;
import me.sppfly.operator.base.Operator1Out;
import me.sppfly.operator.sink.Sink;
import me.sppfly.operator.source.Source;

/**
 * Topology is a graph of streams, it is the same thing as Topology in Kafka or
 * StreamGraph in Flink.
 */
public class Topology {

	private List<Source<?>> sources;

	private List<Sink<?>> sinks;

	public Topology() {
		this.sources = new ArrayList<>();
		this.sinks = new ArrayList<>();
	}

	public void addSource(Source<?> source) {
		this.sources.add(source);
	}

	public void addSink(Sink<?> sink) {
		this.sinks.add(sink);
	}

	public <T> void connect(Operator1Out<T> left, Operator1In<T> right) {
		BlockStream<T> blockStream = new BlockStream<>(100);
		left.addOutput(blockStream);
		right.addInput(blockStream);
	}

	public List<Source<?>> getSources() {
		return sources;
	}

	public List<Sink<?>> getSinks() {
		return sinks;
	}
}
