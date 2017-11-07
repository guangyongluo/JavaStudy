package com.lwei.thread.synchronize;

public class Service9_5 {

	synchronized public static void printA() {
		try {
			System.out.println(
					"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printA");
			Thread.sleep(3000);
			System.out.println(
					"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printA");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public static void printB() {
		System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printB");
		System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printB");
	}

	synchronized public void printC() {
		System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printC");
		System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printC");
	}

}
