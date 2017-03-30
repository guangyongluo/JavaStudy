package com.lwei.thread.group;

import java.lang.Thread.UncaughtExceptionHandler;

public class ObjectUncaughtExceptionHandler15 implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("对象的异常处理");
		e.printStackTrace();
	}

}
