package com.lwei.thread.lock;

public class Run22 {

	public static void main(String[] args) {
		try {
			Service22 service = new Service22();
			MyThread22 myThread = new MyThread22(service);
			myThread.start();
			Thread.sleep(3000);
			myThread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
