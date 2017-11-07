package com.lwei.thread.singleton;

public class Run0 {

	public static void main(String[] args) {
		MyThread0 t1 = new MyThread0();
		MyThread0 t2 = new MyThread0();
		MyThread0 t3 = new MyThread0();

		t1.start();
		t2.start();
		t3.start();

	}

}
