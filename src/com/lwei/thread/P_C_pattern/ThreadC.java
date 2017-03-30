package com.lwei.thread.P_C_pattern;

public class ThreadC extends Thread {

	private Consumer c;

	public ThreadC(Consumer c) {
		super();
		this.c = c;
	}

	@Override
	public void run() {
		while (true) {
			c.getValue();
		}
	}

}
