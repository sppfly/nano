package me.sppfly.operator.source;

import me.sppfly.operator.base.Operator1Out;

public interface Source<T> extends Operator1Out<T> {

	T get();

}
