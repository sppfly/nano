package me.sppfly.operator;

public interface Sink<T> extends Operator1In<T> {

	void to(T t);

}
