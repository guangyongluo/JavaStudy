package com.lwei.thread.P_C_pattern_final;

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
