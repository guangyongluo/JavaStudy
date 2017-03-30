package com.lwei.thread.P_C_pattern_stack2;

public class Producer {

	private MyStack myStack;

	public Producer(MyStack myStack) {
		super();
		this.myStack = myStack;
	}

	public void pushService() {
		myStack.push();
	}
}
