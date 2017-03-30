package com.lwei.thread;

public class Run7 {
	public static void main(String[] args) {
		MyThread7 mythread = new MyThread7();
		System.out.println("begin ==" + mythread.isAlive());
		mythread.start();
		System.out.println("end ==" + mythread.isAlive());
	}
}
