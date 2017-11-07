package com.lwei.thread.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService8 {

	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean hasValue = false;

	public void set() {
		try {
			lock.lock();
			while (hasValue == true) {
				System.out.println(Thread.currentThread().getName() + "有可能++连续");
				condition.await();
			}
			System.out.println(Thread.currentThread().getName() + "打印+");
			hasValue = true;
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void get() {
		try {
			lock.lock();
			while (hasValue == false) {
				System.out.println(Thread.currentThread().getName() + "有可能--连续");
				condition.await();
			}
			System.out.println(Thread.currentThread().getName() + "打印-");
			hasValue = false;
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

}
