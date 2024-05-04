package me.sppfly;

import me.sppfly.operator.source.Source;

public interface Executor {
	void start();

	void stop();

	Source addSource();
}
