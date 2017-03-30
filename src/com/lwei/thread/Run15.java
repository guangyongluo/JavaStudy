package com.lwei.thread;

public class Run15 {
	public static void main(String[] args) {
		MyThread15 thread = new MyThread15();
		thread.start();
		thread.interrupt();
		System.out.println("end!");
	}
}
