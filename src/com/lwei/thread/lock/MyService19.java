package com.lwei.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class MyService19 {

	public ReentrantLock lock = new ReentrantLock();

	public void waitMethod() {
		if (lock.tryLock()) {
			System.out.println(Thread.currentThread().getName() + "获得锁");
		} else {
			System.out.println(Thread.currentThread().getName() + "没有获得锁");
		}
	}
}
