package com.lwei.thread.singleton;

public class Run2_2 {

	public static void main(String[] args) {
		MyThread2_2 t1 = new MyThread2_2();
		MyThread2_2 t2 = new MyThread2_2();
		MyThread2_2 t3 = new MyThread2_2();

		t1.start();
		t2.start();
		t3.start();

		// 此版本代码虽然是正确的
		// 但public static MyObject getInstance()方法
		// 中的代码全部都是同步的了，这样也会降低运行效率
	}

}
