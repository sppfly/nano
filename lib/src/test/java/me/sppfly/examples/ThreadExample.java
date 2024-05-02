package me.sppfly.examples;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
		});
		thread.start();
	}
}
