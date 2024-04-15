package me.sppfly;

import me.sppfly.operator.Source;

public interface Executor {
	void start();

	void stop();

	Source addSource();
}
