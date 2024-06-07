package me.sppfly;

import me.sppfly.stream.Topology;

import java.time.Duration;
import java.util.function.Consumer;
import java.util.function.Supplier;

import me.sppfly.operator.sink.BaseSink;
import me.sppfly.operator.source.BaseSource;

public class Main {
	public static void main(String[] args) {

		Topology topology = new Topology();
		var source = new BaseSource<String>("source", 0, new Supplier<>() {
			private int i = 0;

			@Override
			public String get() {
				return "Hello " + i++;
			}

		});
		topology.addSource(source);
		var sink = new BaseSink<String>("sink", 1, new Consumer<>() {
			@Override
			public void accept(String t) {
				try {
					Thread.sleep(Duration.ofMillis(1));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(t);
			}

		});
		topology.addSink(sink);

		topology.connect(source, sink);

		var nanoStream = new NanoStream(topology);
		nanoStream.run();
		// nanoStream.stop();
	}
}
