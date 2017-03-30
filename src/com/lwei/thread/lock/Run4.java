package com.lwei.thread.lock;

public class Run4 {

	public static void main(String[] args) throws InterruptedException {

		MyService4 service = new MyService4();

		ThreadA4 a = new ThreadA4(service);
		a.start();

		Thread.sleep(3000);

		service.signal();

	}

}
