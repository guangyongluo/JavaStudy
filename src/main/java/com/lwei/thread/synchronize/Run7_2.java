package com.lwei.thread.synchronize;

public class Run7_2 {

	public static void main(String[] args) {
		ObjectService7_2 service = new ObjectService7_2();

		ThreadA7_2 a = new ThreadA7_2(service);
		a.setName("a");
		a.start();

		ThreadB7_2 b = new ThreadB7_2(service);
		b.setName("b");
		b.start();
	}

}
