package com.lwei.thread;

public class Run18_1 {
	public static void main(String[] args) {
		System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println("main thread end   priority=" + Thread.currentThread().getPriority());
		MyThread18_1 thread1 = new MyThread18_1();
		thread1.start();
	}
}
