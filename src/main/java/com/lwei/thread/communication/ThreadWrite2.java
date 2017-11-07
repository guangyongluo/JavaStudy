package com.lwei.thread.communication;

import java.io.PipedWriter;

public class ThreadWrite2 extends Thread {

	private WriteData2 write;
	private PipedWriter out;

	public ThreadWrite2(WriteData2 write, PipedWriter out) {
		super();
		this.write = write;
		this.out = out;
	}

	@Override
	public void run() {
		write.writeMethod(out);
	}

}
