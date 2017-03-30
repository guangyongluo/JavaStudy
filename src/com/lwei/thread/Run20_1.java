package com.lwei.thread;

public class Run20_1 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MyThread20_1 thread1 = new MyThread20_1();
			thread1.setPriority(5);
			thread1.start();

			MyThread20_2 thread2 = new MyThread20_2();
			thread2.setPriority(6);
			thread2.start();
		}
	}
}
