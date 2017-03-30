package com.lwei.thread.P_C_pattern;

public class Run {

	public static void main(String[] args) {

		String lock = new String("");
		Producer p = new Producer(lock);
		Consumer r = new Consumer(lock);

		ThreadP pThread = new ThreadP(p);
		ThreadC rThread = new ThreadC(r);

		pThread.start();
		rThread.start();
	}

}
