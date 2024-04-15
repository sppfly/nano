package me.sppfly.operator;

public interface Sink<T> extends Active {

	void to(T t);
}
