package com.lwei.thread;

public class Run13_forprint {

	public static void main(String[] args) {
		try {
			MyThread13_forprint thread = new MyThread13_forprint();
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
