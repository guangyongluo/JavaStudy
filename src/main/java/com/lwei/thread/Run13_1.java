package com.lwei.thread;

public class Run13_1 {

	public static void main(String[] args) {
		try {
			MyThread13_1 thread = new MyThread13_1();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}

}
