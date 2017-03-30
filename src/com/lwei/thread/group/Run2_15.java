package com.lwei.thread.group;

public class Run2_15 {

	public static void main(String[] args) {
		MyThreadGroup15 group = new MyThreadGroup15("我的线程组");
		MyThread15 myThread = new MyThread15(group, "我的线程");
		// 对象
		// myThread
		// .setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		// 类
		// MyThread
		// .setDefaultUncaughtExceptionHandler(new
		// StateUncaughtExceptionHandler());
		myThread.start();

	}
}
