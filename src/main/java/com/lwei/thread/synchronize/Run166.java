package com.lwei.thread.synchronize;

public class Run166 {
	public static void main(String[] args) {
		try {
			RunThread16 thread = new RunThread16();
			thread.start();
			Thread.sleep(1000);
			thread.setRunning(false);
			System.out.println("已经赋值为false");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
