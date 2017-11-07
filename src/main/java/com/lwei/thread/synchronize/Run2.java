package com.lwei.thread.synchronize;

public class Run2 {

	public static void main(String[] args) {

		HasSelfPrivateNum2 numRef = new HasSelfPrivateNum2();

		ThreadA2 athread = new ThreadA2(numRef);
		athread.start();

		ThreadB2 bthread = new ThreadB2(numRef);
		bthread.start();

	}

}
