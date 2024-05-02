package me.sppfly.operator;

import me.sppfly.stream.Stream;

public interface Operator1In<IN> extends Node {

	void addInput(Stream<IN> inStream);
}
