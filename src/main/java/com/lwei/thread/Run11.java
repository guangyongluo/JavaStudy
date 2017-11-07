package com.lwei.thread;

public class Run11 {

	public static void main(String[] args) {
		try {
			MyThread11 thread = new MyThread11();
			thread.start();
			Thread.sleep(200);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
	}

}
