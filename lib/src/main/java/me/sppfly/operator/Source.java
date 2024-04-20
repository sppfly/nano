package me.sppfly.operator;

import me.sppfly.stream.Stream;

public interface Source<T> extends Active, Named {

	T get();

	void addOutput(Stream<T> outStream);
}
