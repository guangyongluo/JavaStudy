package com.lwei.thread.synchronize;

public class MyThread9_2 extends Thread {

	private MyOneList list;

	public MyThread9_2(MyOneList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		MyService9 msRef = new MyService9();
		msRef.addServiceMethod(list, "B");
	}

}