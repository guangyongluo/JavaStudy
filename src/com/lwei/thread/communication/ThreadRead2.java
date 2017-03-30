package com.lwei.thread.communication;

import java.io.PipedReader;

public class ThreadRead2 extends Thread {

	private ReadData2 read;
	private PipedReader input;

	public ThreadRead2(ReadData2 read, PipedReader input) {
		super();
		this.read = read;
		this.input = input;
	}

	@Override
	public void run() {
		read.readMethod(input);
	}
}
