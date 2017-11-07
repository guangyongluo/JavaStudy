package com.lwei.thread.communication;

public class Run20 {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("       在Main线程中取值=" + Tools20.tl.get());
				Thread.sleep(100);
			}
			Thread.sleep(5000);
			ThreadA20 a = new ThreadA20();
			a.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
