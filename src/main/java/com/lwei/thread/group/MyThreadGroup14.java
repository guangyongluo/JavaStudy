package com.lwei.thread.group;

public class MyThreadGroup14 extends ThreadGroup {

	public MyThreadGroup14(String name) {
		super(name);
	}

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		super.uncaughtException(t, e);
		this.interrupt();
	}

}
