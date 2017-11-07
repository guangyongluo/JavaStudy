package com.lwei.thread.state;

public class Run4 {

	// NEW,
	// RUNNABLE,
	// TERMINATED,
	// BLOCKED,
	// WAITING,
	// TIMED_WAITING,

	public static void main(String[] args) {
		try {
			MyThread4 t = new MyThread4();
			t.start();
			Thread.sleep(1000);
			System.out.println("main方法中的t状态：" + t.getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
