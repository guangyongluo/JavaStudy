package com.lwei.thread.synchronize;

public class MyThreadB8_4 extends Thread {

	private MyList list;

	public MyThreadB8_4(MyList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			list.add("threadB" + (i + 1));
		}
	}
}
