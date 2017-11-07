package com.lwei.thread.synchronize;

public class MyService9 {

	public MyOneList addServiceMethod(MyOneList list, String data) {
		try {
			synchronized (list) {
				if (list.getSize() < 1) {
					Thread.sleep(2000);
					list.add(data);
					System.out.println("线程名：" + Thread.currentThread().getName() + " list: " + list);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return list;
	}

}
