package com.lwei.thread;

public class Run12_3 {
	public static void main(String[] args) {
		try {
			MyThread12 thread = new MyThread12();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			System.out.println("是否停止1？" + thread.isInterrupted());
			System.out.println("是否停止2？" + thread.isInterrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
