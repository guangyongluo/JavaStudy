package com.lwei.thread;

public class Run5 {

	public static void main(String[] args) {

		MyThread5 run = new MyThread5();

		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		Thread t3 = new Thread(run);
		Thread t4 = new Thread(run);
		Thread t5 = new Thread(run);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
