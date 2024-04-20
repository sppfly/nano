package me.sppfly.stream;

import java.util.concurrent.ArrayBlockingQueue;

import me.sppfly.NanoException;
import me.sppfly.operator.Sink;

/// 
/// A blocking stream with specific capacity, this is essentially a
/// thread-safe queue
///
public class BlockStream<T> implements Stream<T> {

	private ArrayBlockingQueue<T> queue;

	public BlockStream(Integer capacity) {
		this.queue = new ArrayBlockingQueue<>(capacity);
	}

	@Override
	public void push(T event) {
		try {
			this.queue.put(event);
		} catch (InterruptedException e) {
			throw new NanoException(e);
		}
	}

	@Override
	public T pop() {
		try {
			return this.queue.take();
		} catch (InterruptedException e) {
			throw new NanoException(e);
		}
	}


}
