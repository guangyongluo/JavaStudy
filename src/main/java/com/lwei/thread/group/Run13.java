package com.lwei.thread.group;

public class Run13 {

	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("我的线程组");
		MyThread13[] myThread = new MyThread13[10];
		for (int i = 0; i < myThread.length; i++) {
			myThread[i] = new MyThread13(group, "线程" + (i + 1), "1");
			myThread[i].start();
		}
		MyThread13 newT = new MyThread13(group, "报错线程", "a");
		newT.start();
	}

}
