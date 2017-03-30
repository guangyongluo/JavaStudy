package com.lwei.thread.synchronize;

public class Run2_1 {

	public static void main(String[] args) {

		HasSelfPrivateNum2_1 numRef1 = new HasSelfPrivateNum2_1();
		HasSelfPrivateNum2_1 numRef2 = new HasSelfPrivateNum2_1();

		ThreadA2_1 athread = new ThreadA2_1(numRef1);
		athread.start();

		ThreadB2_1 bthread = new ThreadB2_1(numRef2);
		bthread.start();

	}

}
