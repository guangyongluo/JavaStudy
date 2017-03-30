package com.lwei.thread;

public class Run19_1 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MyThread19_1 thread1 = new MyThread19_1();
			thread1.setPriority(1);
			thread1.start();

			MyThread19_2 thread2 = new MyThread19_2();
			thread2.setPriority(10);
			thread2.start();
		}
	}
}
