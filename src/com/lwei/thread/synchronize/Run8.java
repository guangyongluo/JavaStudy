package com.lwei.thread.synchronize;

public class Run8 {

	public static void main(String[] args) throws InterruptedException {
		Task8 task = new Task8();

		MyThread8_1 thread1 = new MyThread8_1(task);
		thread1.start();

		Thread.sleep(100);

		MyThread8_2 thread2 = new MyThread8_2(task);
		thread2.start();
	}
}
