package com.lwei.thread.synchronize;

public class Run8_2 {

	public static void main(String[] args) {
		Service8_2 service = new Service8_2();

		ThreadA8_2 a = new ThreadA8_2(service);
		a.setName("A");
		a.start();

		ThreadB8_2 b = new ThreadB8_2(service);
		b.setName("B");
		b.start();

	}

}
