package com.lwei.thread.synchronize;

public class Run2_3 {

	public static void main(String[] args) {
		MyObject2 object = new MyObject2();
		ThreadA2_3 a = new ThreadA2_3(object);
		a.setName("A");
		ThreadB2_3 b = new ThreadB2_3(object);
		b.setName("B");

		a.start();
		b.start();
	}

}
