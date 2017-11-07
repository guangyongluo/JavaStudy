package com.lwei.thread.communication;

public class Run15 {

	public static void main(String[] args) {

		try {
			ThreadA15 a = new ThreadA15();
			ThreadB15 b = new ThreadB15();
			a.start();
			b.start();

			for (int i = 0; i < 100; i++) {
				if (Tools.tl.get() == null) {
					Tools.tl.set("Main" + (i + 1));
				} else {
					System.out.println("Main get Value=" + Tools.tl.get());
				}
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
