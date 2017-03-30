package com.lwei.thread.singleton;

public class Run2_1 {

	public static void main(String[] args) {
		MyThread2_1 t1 = new MyThread2_1();
		MyThread2_1 t2 = new MyThread2_1();
		MyThread2_1 t3 = new MyThread2_1();

		t1.start();
		t2.start();
		t3.start();

	}

}
