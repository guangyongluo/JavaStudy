package com.lwei.thread.group;

public class Run14 {

	public static void main(String[] args) {
		MyThreadGroup14 group = new MyThreadGroup14("我的线程组");
		MyThread14[] myThread = new MyThread14[10];
		for (int i = 0; i < myThread.length; i++) {
			myThread[i] = new MyThread14(group, "线程" + (i + 1), "1");
			myThread[i].start();
		}
		MyThread14 newT = new MyThread14(group, "报错线程", "a");
		newT.start();
	}

}
