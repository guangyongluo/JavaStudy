package com.lwei.thread.state;

public class Run2 {

	// NEW,
	// RUNNABLE,
	// TERMINATED,

	// BLOCKED,
	// WAITING,
	// TIMED_WAITING,

	public static void main(String[] args) {
		try {
			MyThread2 t = new MyThread2();
			t.start();
			Thread.sleep(1000);
			System.out.println("main方法中的状态：" + t.getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
