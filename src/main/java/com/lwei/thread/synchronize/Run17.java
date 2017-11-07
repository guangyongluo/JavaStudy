package com.lwei.thread.synchronize;

public class Run17 {
	public static void main(String[] args) {
		MyThread17[] mythreadArray = new MyThread17[100];
		for (int i = 0; i < 100; i++) {
			mythreadArray[i] = new MyThread17();
		}

		for (int i = 0; i < 100; i++) {
			mythreadArray[i].start();
		}

	}

}
