package me.sppfly.stream;

/**
 * A stream is like a queue, where event flow from one way to another
 */
public interface Stream<T> {

	void push(T event);

	T pop();
}
