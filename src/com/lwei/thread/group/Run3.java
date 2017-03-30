package com.lwei.thread.group;

public class Run3 {
	// 方法activeGroupCount()取得当前线程对象的子线程组数量
	// 方法enumerate()的作用是将线程组中的子线程组以复制的形式拷贝到ThreadGroup[]数组对象中
	public static void main(String[] args) {
		System.out.println("A处线程" + Thread.currentThread().getName() + " 所属的线程组名为："
				+ Thread.currentThread().getThreadGroup().getName() + " " + " 中有线程组数量："
				+ Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup group = new ThreadGroup("新的组");// 自动加到main组中
		System.out.println("B处线程：" + Thread.currentThread().getName() + " 所属的线程组名为："
				+ Thread.currentThread().getThreadGroup().getName() + " " + " 中有线程组数量："
				+ Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup[] threadGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadGroup);
		for (int i = 0; i < threadGroup.length; i++) {
			System.out.println("第一个线程组名称为：" + threadGroup[i].getName());
		}
	}
}
