package com.lwei.thread.synchronize;

public class Run5_2 {

	public static void main(String[] args) {
		ObjectService service = new ObjectService();

		ThreadA5_2 a = new ThreadA5_2(service);
		a.setName("a");
		a.start();

		ThreadB5_2 b = new ThreadB5_2(service);
		b.setName("b");
		b.start();
	}

}
