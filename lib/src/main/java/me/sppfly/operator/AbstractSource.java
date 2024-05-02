package me.sppfly.operator;

import java.util.function.Supplier;

import me.sppfly.stream.Stream;

public abstract class AbstractSource<T> implements Source<T> {

	private boolean active = false;

	private String name;

	private Integer id;

	private Stream<T> outStream;

	protected Supplier<T> supplier;

	protected AbstractSource(String name, Integer id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public void addOutput(Stream<T> outStream) {
		this.outStream = outStream;
	}

	@Override
	public T get() {
		return this.supplier.get();
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

}
