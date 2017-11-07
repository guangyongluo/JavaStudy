package com.lwei.thread.synchronize;

public class Run8_3 {

	public static void main(String[] args) {
		Service8_3 service = new Service8_3();

		ThreadA8_3 a = new ThreadA8_3(service);
		a.setName("A");
		a.start();

		ThreadB8_3 b = new ThreadB8_3(service);
		b.setName("B");
		b.start();

	}

}
