package com.lwei.thread.synchronize;

public class Run9_111 {

	public static void main(String[] args) {

		try {
			Service9_11 service = new Service9_11();
			Userinfo userinfo = new Userinfo();

			ThreadA9_11 a = new ThreadA9_11(service, userinfo);
			a.setName("a");
			a.start();
			Thread.sleep(50);
			ThreadB9_11 b = new ThreadB9_11(service, userinfo);
			b.setName("b");
			b.start();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
