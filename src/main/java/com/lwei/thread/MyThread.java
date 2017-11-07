package com.lwei.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("run = " + Thread.currentThread().getName());
				System.out.println("Thread ID = " + Thread.currentThread().getId());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
