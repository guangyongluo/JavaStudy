package com.lwei.thread;

public class MyThread16_1 extends Thread {
	@Override
	public void run() {
		try {
			this.stop();
		} catch (ThreadDeath e) {
			System.out.println("进入了catch()方法");
			e.printStackTrace();
		}
	}
}