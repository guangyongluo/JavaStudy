package com.lwei.thread.singleton;

public class Run2 {

	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();

		t1.start();
		t2.start();
		t3.start();

	}

}
