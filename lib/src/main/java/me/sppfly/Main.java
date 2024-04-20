package me.sppfly;

import me.sppfly.stream.Stream;

public class Main {
	public static void main(String[] args) {
		var streamBuilder = new StreamBuilder();

		Stream<Object> stream = streamBuilder.from();

		var nanoStream = new NanoStream(stream);
		nanoStream.run();
		nanoStream.stop();

	}
}
