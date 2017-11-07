package com.lwei.thread.communication;

public class Test8 {

	public static void main(String[] args) {
		try {
			MyThread8 threadTest = new MyThread8();
			threadTest.start();
			threadTest.join();

			System.out.println("我想当threadTest对象执行完毕后我再执行，我做到了");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
