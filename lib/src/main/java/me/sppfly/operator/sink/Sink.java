package me.sppfly.operator.sink;

import me.sppfly.operator.base.Operator1In;

public interface Sink<T> extends Operator1In<T> {

	void to(T t);

}
