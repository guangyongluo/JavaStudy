package com.lwei.thread;

public class Run3 {
	public static void main(String[] args) {
		MyThread3 a = new MyThread3("A");
		MyThread3 b = new MyThread3("B");
		MyThread3 c = new MyThread3("C");
		a.start();
		b.start();
		c.start();
	}
}
