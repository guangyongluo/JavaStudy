package com.lwei.thread.P_C_pattern_final;

public class C_Thread extends Thread {

	private Consumer r;

	public C_Thread(Consumer r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			r.popService();
		}
	}

}
