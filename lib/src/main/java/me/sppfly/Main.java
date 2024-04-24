package me.sppfly;

import me.sppfly.stream.Stream;
import me.sppfly.stream.Topology;
import me.sppfly.operator.AbstractSink;
import me.sppfly.operator.TextSource;

public class Main {
  public static void main(String[] args) {
    var streamBuilder = new StreamBuilder();

	Topology topology = new Topology();
	topology.addSource(new TextSource("source", 0));
	topology.addSink(new AbstractSink<String>() {
		
	});

    var nanoStream = new NanoStream(stream);
    nanoStream.run();
    nanoStream.stop();
  }
}
