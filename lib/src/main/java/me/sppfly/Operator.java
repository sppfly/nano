package me.sppfly;

public interface Operator<IN, OUT> {

    void addInput(Stream<IN> inStream);

    void addOutput(Stream<OUT> outStream);

    
}
