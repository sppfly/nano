package me.sppfly;

import me.sppfly.operator.source.Source;
import me.sppfly.stream.BlockStream;
import me.sppfly.stream.Stream;

public class StreamBuilder {


    public <T> Stream<T> from(Source<T> source) {
        BlockStream<T> blockStream = new BlockStream<>(100);
        source.addOutput(blockStream);
        return blockStream;
    }

}
