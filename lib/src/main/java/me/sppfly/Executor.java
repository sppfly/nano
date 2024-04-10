package me.sppfly;

public interface Executor {
    void start();

    void stop();


    Source addSource();
}
