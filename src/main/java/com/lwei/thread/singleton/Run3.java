package com.lwei.thread.singleton;

public class Run3 {

	public static void main(String[] args) {
		MyThread3 t1 = new MyThread3();
		MyThread3 t2 = new MyThread3();
		MyThread3 t3 = new MyThread3();

		t1.start();
		t2.start();
		t3.start();

	}

}
