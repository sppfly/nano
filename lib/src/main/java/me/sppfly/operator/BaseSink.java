package me.sppfly.operator;

import java.util.function.Consumer;

import me.sppfly.stream.Stream;

/// 
/// ! This sounds like an awful idea, it wastes the only chance for others to 
/// ! extends a parent class. But lets just keep it here.
/// 
public class BaseSink<T> implements Sink<T> {

	private boolean active = false;

	private String name;

	private Integer id;

	protected Consumer<T> consumer;

	private Stream<T> inputStream;

	public BaseSink(String name, Integer id, Consumer<T> consumer) {
		this.name = name;
		this.id = id;
	}

	@Override
	public void disable() {
		this.active = false;
	}

	@Override
	public void enable() {
		this.active = true;
	}

	@Override
	public boolean isEnabled() {
		return this.active;
	}

	@Override
	public Integer id() {
		return this.id;
	}

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public void to(T t) {
		consumer.accept(t);
	}

	@Override
	public void addInput(Stream<T> stream) {
		this.inputStream = stream;
	}

}
