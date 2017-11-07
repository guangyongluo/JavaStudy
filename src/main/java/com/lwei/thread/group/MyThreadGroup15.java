package com.lwei.thread.group;

public class MyThreadGroup15 extends ThreadGroup {

	public MyThreadGroup15(String name) {
		super(name);
	}

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		super.uncaughtException(t, e);
		System.out.println("线程组的异常处理");
		e.printStackTrace();
	}

}
