package com.lwei.thread.group;

import java.lang.Thread.UncaughtExceptionHandler;

public class Main3 {

	public static void main(String[] args) {
		MyThread12.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("线程:" + t.getName() + " 出现了异常：");
				e.printStackTrace();

			}
		});

		MyThread12 t1 = new MyThread12();
		t1.setName("线程t1");
		t1.start();

		MyThread12 t2 = new MyThread12();
		t2.setName("线程t2");
		t2.start();
	}
}
