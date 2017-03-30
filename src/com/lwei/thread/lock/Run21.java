package com.lwei.thread.lock;

public class Run21 {

	public static void main(String[] args) {
		try {
			Service21 service = new Service21();
			MyThread21 myThread = new MyThread21(service);
			myThread.start();
			Thread.sleep(3000);
			myThread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
