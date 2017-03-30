package com.lwei.thread.communication;

public class ThreadB9 extends Thread {

	@Override
	public void run() {
		try {
			ThreadA9 a = new ThreadA9();
			a.start();
			a.join();

			System.out.println("线程B在run end处打印了");
		} catch (InterruptedException e) {
			System.out.println("线程B在catch处打印了");
			e.printStackTrace();
		}
	}

}
