package com.lwei.thread.communication;

public class ThreadB1 extends Thread {

	private MyList1 list;

	public ThreadB1(MyList1 list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		try {
			while (true) {
				if (list.size() == 5) {
					System.out.println("==5了，线程b要退出了！");
					throw new InterruptedException();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
