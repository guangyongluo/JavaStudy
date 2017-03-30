package com.lwei.thread;

public class Run12_1 {
	public static void main(String[] args) {
		try {
			MyThread12 thread = new MyThread12();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			Thread.currentThread().interrupt();
			System.out.println("是否停止1？" + thread.interrupted());
			System.out.println("是否停止2？" + thread.interrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
