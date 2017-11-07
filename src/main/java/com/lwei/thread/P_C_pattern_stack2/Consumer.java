package com.lwei.thread.P_C_pattern_stack2;

public class Consumer {

	private MyStack myStack;

	public Consumer(MyStack myStack) {
		super();
		this.myStack = myStack;
	}

	public void popService() {
		System.out.println("pop=" + myStack.pop());
	}
}
