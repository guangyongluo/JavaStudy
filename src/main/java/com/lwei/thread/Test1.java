package com.lwei.thread;

public class Test1 {
	public static void main(String[] args) {
		MyThread1 t11 = new MyThread1(1);
		MyThread1 t12 = new MyThread1(2);
		MyThread1 t13 = new MyThread1(3);
		MyThread1 t14 = new MyThread1(4);
		MyThread1 t15 = new MyThread1(5);
		MyThread1 t16 = new MyThread1(6);
		MyThread1 t17 = new MyThread1(7);
		MyThread1 t18 = new MyThread1(8);
		MyThread1 t19 = new MyThread1(9);
		MyThread1 t110 = new MyThread1(10);
		MyThread1 t111 = new MyThread1(11);
		MyThread1 t112 = new MyThread1(12);
		MyThread1 t113 = new MyThread1(13);

		t11.start();
		t12.start();
		t13.start();
		t14.start();
		t15.start();
		t16.start();
		t17.start();
		t18.start();
		t19.start();
		t110.start();
		t111.start();
		t112.start();
		t113.start();

	}
}
