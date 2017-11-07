package com.lwei.thread.communication;

public class Test7 {

	public static void main(String[] args) {

		MyThread7 threadTest = new MyThread7();
		threadTest.start();

		// Thread.sleep(?)
		System.out.println("我想当threadTest对象执行完毕后我再执行");
		System.out.println("但上面代码中的sleep()中的值应该写多少呢？");
		System.out.println("答案是：根据不能确定:)");
	}

}
