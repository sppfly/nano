package me.sppfly;

import me.sppfly.operator.base.Node;

public class NanoThread extends Thread {

	private Node node;

	public NanoThread(Node node) {
		this.node = node;
	}

	@Override
	public void start() {
		node.enable();
		super.start();
	}

	@Override
	public void run() {
		while (node.isEnabled()) {
			node.process();
		}
	}

	@Override
	public void interrupt() {
		node.disable();
		super.interrupt();
	}
}
