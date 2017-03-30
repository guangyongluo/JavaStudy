package com.lwei.thread.singleton;

public class Run5 {

	public static void main(String[] args) {

		MyThread5 t1 = new MyThread5();
		MyThread5 t2 = new MyThread5();
		MyThread5 t3 = new MyThread5();

		t1.start();
		t2.start();
		t3.start();

	}

}
