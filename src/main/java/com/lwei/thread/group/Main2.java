package com.lwei.thread.group;

import java.lang.Thread.UncaughtExceptionHandler;

public class Main2 {

	public static void main(String[] args) {
		MyThread12 t1 = new MyThread12();
		t1.setName("线程t1");
		t1.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("线程:" + t.getName() + " 出现了异常：");
				e.printStackTrace();
			}
		});
		t1.start();

		MyThread12 t2 = new MyThread12();
		t2.setName("线程t2");
		t2.start();
	}
}
