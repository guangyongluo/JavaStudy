package com.lwei.thread.communication;

public class Test1 {

	public static void main(String[] args) {
		MyList1 service = new MyList1();

		ThreadA1 a = new ThreadA1(service);
		a.setName("A");
		a.start();

		ThreadB1 b = new ThreadB1(service);
		b.setName("B");
		b.start();

	}

}
