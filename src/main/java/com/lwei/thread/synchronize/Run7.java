package com.lwei.thread.synchronize;

public class Run7 {

	public static void main(String[] args) {
		Task7 task = new Task7();

		MyThread7_1 thread1 = new MyThread7_1(task);
		thread1.start();

		MyThread7_2 thread2 = new MyThread7_2(task);
		thread2.start();
	}
}
