package com.lwei.thread.lock;

public class Run2 {

	public static void main(String[] args) {

		MyService2 service = new MyService2();

		ThreadA2 a = new ThreadA2(service);
		a.start();

	}

}
