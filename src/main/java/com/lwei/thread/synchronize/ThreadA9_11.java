package com.lwei.thread.synchronize;

public class ThreadA9_11 extends Thread {

	private Service9_11 service;
	private Userinfo userinfo;

	public ThreadA9_11(Service9_11 service, Userinfo userinfo) {
		super();
		this.service = service;
		this.userinfo = userinfo;
	}

	@Override
	public void run() {
		service.serviceMethodA(userinfo);
	}

}
