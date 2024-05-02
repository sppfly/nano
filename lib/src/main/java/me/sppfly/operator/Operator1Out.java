package me.sppfly.operator;

import me.sppfly.stream.Stream;

public interface Operator1Out<OUT> extends Node {

	void addOutput(Stream<OUT> outStream);


}
