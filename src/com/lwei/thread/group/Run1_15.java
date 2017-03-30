package com.lwei.thread.group;

public class Run1_15 {

	public static void main(String[] args) {
		MyThread15 myThread = new MyThread15();
		// 对象
		// smyThread
		// .setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		// 类
		MyThread15.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler15());
		myThread.start();
	}
}
