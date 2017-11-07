package com.lwei.thread.synchronize;

public class MyThreadA8_4 extends Thread {

	private MyList list;

	public MyThreadA8_4(MyList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			list.add("threadA" + (i + 1));
		}
	}

}
