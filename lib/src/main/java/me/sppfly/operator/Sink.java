package me.sppfly.operator;

import me.sppfly.stream.Stream;

public interface Sink<T> extends Active, Named {

	void to(T t);

	void addInput(Stream<T> stream);
}
