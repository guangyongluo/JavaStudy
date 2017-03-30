package com.lwei.thread.synchronize;

public class Run2_2 {

	public static void main(String[] args) {
		MyObject object = new MyObject();
		ThreadA2_2 a = new ThreadA2_2(object);
		a.setName("A");
		ThreadB2_2 b = new ThreadB2_2(object);
		b.setName("B");

		a.start();
		b.start();
	}

}
