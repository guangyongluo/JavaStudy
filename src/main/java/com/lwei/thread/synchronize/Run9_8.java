package com.lwei.thread.synchronize;

public class Run9_8 {

	public static void main(String[] args) {
		Service9_8 service = new Service9_8();

		ThreadA9_8 athread = new ThreadA9_8(service);
		athread.start();

		ThreadB9_8 bthread = new ThreadB9_8(service);
		bthread.start();
	}

}
