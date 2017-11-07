package com.lwei.thread;

public class Run16_2 {
	public static void main(String[] args) {
		try {
			SynchronizedObject object = new SynchronizedObject();
			MyThread16_2 thread = new MyThread16_2(object);
			thread.start();
			Thread.sleep(500);
			thread.stop();
			System.out.println(object.getUsername() + " " + object.getPassword());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
