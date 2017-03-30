package com.lwei.thread;

public class Run20 {

	public static void main(String[] args) {

		try {
			System.out.println("main begin");
			MyThread20 thread = new MyThread20();
			thread.start();
			Thread.sleep(1000);
			System.out.println("before suspend!");
			thread.suspend();
			System.out.println("after suspend!");
			System.out.println("main end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
