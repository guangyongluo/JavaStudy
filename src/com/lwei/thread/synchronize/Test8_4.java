package com.lwei.thread.synchronize;

public class Test8_4 {

	public static void main(String[] args) {
		MyList mylist = new MyList();

		MyThreadA8_4 a = new MyThreadA8_4(mylist);
		a.setName("A");
		a.start();

		MyThreadB8_4 b = new MyThreadB8_4(mylist);
		b.setName("B");
		b.start();
	}

}
