package com.lwei.thread.communication;

public class Run18 {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("       在Main线程中取值=" + Tools18.tl.get());
				Thread.sleep(100);
			}
			Thread.sleep(5000);
			ThreadA18 a = new ThreadA18();
			a.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
