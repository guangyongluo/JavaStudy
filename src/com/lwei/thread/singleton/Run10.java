package com.lwei.thread.singleton;

public class Run10 {

	public static void main(String[] args) {
		MyThread10 t1 = new MyThread10();
		MyThread10 t2 = new MyThread10();
		MyThread10 t3 = new MyThread10();

		t1.start();
		t2.start();
		t3.start();

	}
}
