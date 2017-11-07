package com.lwei.thread.state;

public class Run3 {

	// NEW,
	// RUNNABLE,
	// TERMINATED,
	// BLOCKED,
	// WAITING,
	// TIMED_WAITING,

	public static void main(String[] args) {
		MyThread3_1 t1 = new MyThread3_1();
		t1.setName("a");
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyThread3_2 t2 = new MyThread3_2();
		t2.setName("b");
		t2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main方法中的t2状态：" + t2.getState());

	}
}
