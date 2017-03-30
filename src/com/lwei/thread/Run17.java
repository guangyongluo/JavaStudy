package com.lwei.thread;

public class Run17 {

	public static void main(String[] args) throws InterruptedException {
		MyThread17 t = new MyThread17();
		t.start();
		Thread.sleep(2000);
		t.interrupt();
	}

}
