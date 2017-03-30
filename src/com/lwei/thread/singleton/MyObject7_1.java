package com.lwei.thread.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MyObject7_1 implements Serializable {

	private static final long serialVersionUID = 888L;

	// 内部类方式
	private static class MyObjectHandler {
		private static final MyObject7_1 myObject = new MyObject7_1();
	}

	private MyObject7_1() {
	}

	public static MyObject7_1 getInstance() {
		return MyObjectHandler.myObject;
	}

	protected Object readResolve() throws ObjectStreamException {
		System.out.println("调用了readResolve方法");
		return MyObjectHandler.myObject;
	}

}
