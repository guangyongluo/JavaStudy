package com.lwei.thread;

public class Run24 {
	public static void main(String[] args) {
		try {
			MyThread24 thread = new MyThread24();
			thread.setDaemon(true);
			thread.start();
			Thread.sleep(5000);
			System.out.println("我离开thread对象也不再打印了，也就是停止了！");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
