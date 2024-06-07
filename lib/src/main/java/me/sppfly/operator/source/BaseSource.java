
package me.sppfly.operator.source;

import java.util.function.Supplier;

import me.sppfly.stream.Stream;

public class BaseSource<T> implements Source<T> {

	private boolean active = false;

	private String name;

	private Integer id;

	private Stream<T> outStream;

	private Supplier<T> supplier;

	public BaseSource(String name, Integer id, Supplier<T> supplier) {
		this.name = name;
		this.id = id;
		this.supplier = supplier;
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

	@Override
	public void process() {
		this.outStream.push(get());
	}

}
