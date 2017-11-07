package com.lwei.thread;

public class MyThread17 extends Thread {

	@Override
	public void run() {
		while (true) {
			if (this.isInterrupted()) {
				System.out.println("停止!");
				return;
			}
			System.out.println("timer=" + System.currentTimeMillis());
		}
	}

}
