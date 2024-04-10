package me.sppfly;

public class Main {
    public static void main(String[] args) {
        var streamBuilder = new StreamBuilder();

        Stream<Object> stream = streamBuilder.stream(null);


        var nanoStream = new NanoStream(stream);
        nanoStream.run();
        nanoStream.stop();


    }
}
