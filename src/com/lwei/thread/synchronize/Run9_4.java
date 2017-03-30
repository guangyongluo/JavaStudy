package com.lwei.thread.synchronize;

public class Run9_4 {

	public static void main(String[] args) {

		ThreadA9_4 a = new ThreadA9_4();
		a.setName("A");
		a.start();

		ThreadB9_4 b = new ThreadB9_4();
		b.setName("B");
		b.start();

	}

}
