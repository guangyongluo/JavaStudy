package com.lwei.thread.synchronize;

public class Test3_3 {

	public static void main(String[] args) {
		try {
			Service3_3 service = new Service3_3();

			ThreadA3_3 a = new ThreadA3_3(service);
			a.setName("a");
			a.start();

			Thread.sleep(500);

			ThreadB3_3 b = new ThreadB3_3(service);
			b.setName("b");
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
