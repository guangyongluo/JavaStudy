package com.lwei.thread.synchronize;

public class Test3_4 {

	public static void main(String[] args) {
		Sub3_4 subRef = new Sub3_4();

		MyThreadA3_4 a = new MyThreadA3_4(subRef);
		a.setName("A");
		a.start();

		MyThreadB3_4 b = new MyThreadB3_4(subRef);
		b.setName("B");
		b.start();
	}

}
