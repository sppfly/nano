package me.sppfly.operator;

public class Node extends Thread {
	
	private Operator<?, ?> operator;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (operator.isEnabled()) {
			operator.
		}
	}

	@Override
	public void start() {
		super.start();
		this.operator.enable();
	}

	

}
