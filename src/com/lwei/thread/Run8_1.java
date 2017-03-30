package com.lwei.thread;

public class Run8_1 {
	public static void main(String[] args) {
		MyThread8_1 mythread = new MyThread8_1();
		System.out.println("begin =" + System.currentTimeMillis());
		mythread.run();
		System.out.println("end   =" + System.currentTimeMillis());
	}
}
