package com.lwei.thread.P_C_pattern_stack;

public class P_Thread extends Thread {

	private Producer p;

	public P_Thread(Producer p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			p.pushService();
		}
	}

}
