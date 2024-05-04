package me.sppfly.operator.base;

import me.sppfly.stream.Stream;

public interface Operator1Out<OUT> extends Node {

	void addOutput(Stream<OUT> outStream);


}
