package com.lwei.thread.group;

import java.lang.Thread.UncaughtExceptionHandler;

public class StateUncaughtExceptionHandler15 implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("静态的异常处理");
		e.printStackTrace();
	}

}
