package com.lwei.thread;

public class CountOperate1 extends Thread {

	public CountOperate1() {
		System.out.println("CountOperate---begin");

		System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());

		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());

		System.out.println("Thread.currentThread() == this" + (Thread.currentThread() == this));

		System.out.println("CountOperate---end");
	}

	@Override
	public void run() {
		System.out.println("run---begin");

		System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());

		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());

		System.out.println("Thread.currentThread() == this" + (Thread.currentThread() == this));

		System.out.println("run---end");
	}

}
