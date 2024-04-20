package me.sppfly.stream;

import java.util.Set;

import me.sppfly.operator.Sink;
import me.sppfly.operator.Source;

/**
 * Topology is a graph of streams, it is the same thing as Topology in Kafka or
 * StreamGraph in Flink.
 */
public class Topology {

	private Source<?> source;

	private Sink<?> sink;

	public void addSource() {
		
	}
}
