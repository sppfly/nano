package me.sppfly;

public class StreamBuilder {


    public <T> Stream<T> stream(Source<T> source) {
        return new Stream<T>() {

            @Override
            public void push(T event) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'push'");
            }

            @Override
            public T pop() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'pop'");
            }
            
        };
    }
}
