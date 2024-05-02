package me.sppfly.operator;

public interface Source<T> extends Operator1Out<T> {

	T get();

}
