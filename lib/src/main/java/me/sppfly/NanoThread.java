package me.sppfly;

import me.sppfly.operator.Operator;

public class NanoThread extends Thread {

	private Operator<?, ?> operator;

	@Override
	public void start() {
		operator.enable();
		super.start();
	}

	@Override
	public void run() {
		while (operator.isEnabled()) {
			operator.run();
		}
	}
}
