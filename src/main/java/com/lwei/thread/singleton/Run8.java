package com.lwei.thread.singleton;

public class Run8 {

	public static void main(String[] args) {
		MyThread8 t1 = new MyThread8();
		MyThread8 t2 = new MyThread8();
		MyThread8 t3 = new MyThread8();

		t1.start();
		t2.start();
		t3.start();

	}

}
