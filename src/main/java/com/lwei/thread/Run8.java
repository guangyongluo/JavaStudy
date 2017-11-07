package com.lwei.thread;

public class Run8 {

	public static void main(String[] args) {
		CountOperate1 c = new CountOperate1();
		Thread t1 = new Thread(c);
		System.out.println("main begin t1 isAlive=" + t1.isAlive());
		t1.setName("A");
		t1.start();
		c.start();
		System.out.println("main end t1 isAlive=" + t1.isAlive());
	}

}
