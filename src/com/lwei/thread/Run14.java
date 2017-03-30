package com.lwei.thread;

public class Run14 {

	public static void main(String[] args) {
		try {
			MyThread14 thread = new MyThread14();
			thread.start();
			Thread.sleep(200);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}

}
