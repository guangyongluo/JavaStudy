package com.lwei.thread;

public class Run16 {

	public static void main(String[] args) {
		try {
			MyThread16 thread = new MyThread16();
			thread.start();
			Thread.sleep(8000);
			thread.stop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
