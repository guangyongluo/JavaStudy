package com.lwei.thread;

public class Run8_2 {
	public static void main(String[] args) {
		MyThread8_2 mythread = new MyThread8_2();
		System.out.println("begin =" + System.currentTimeMillis());
		mythread.start();
		System.out.println("end   =" + System.currentTimeMillis());
	}
}
