package com.lwei.thread.group;

public class MyThread12 extends Thread {
	@Override
	public void run() {
		String username = null;
		System.out.println(username.hashCode());
	}

}
