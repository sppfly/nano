package me.sppfly.operator;

import me.sppfly.stream.Stream;

public interface Operator<IN, OUT> extends Active, Named {

	void addInput(Stream<IN> inStream);

	void addOutput(Stream<OUT> outStream);

}
