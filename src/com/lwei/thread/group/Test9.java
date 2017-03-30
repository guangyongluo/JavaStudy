package com.lwei.thread.group;

import java.text.SimpleDateFormat;

public class Test9 {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String[] dateStringArray = new String[] { "2000-01-01", "2000-01-02", "2000-01-03", "2000-01-04", "2000-01-05",
				"2000-01-06", "2000-01-07", "2000-01-08", "2000-01-09", "2000-01-10" };

		System.out.println(dateStringArray.length);

		MyThread9[] threadArray = new MyThread9[10];
		for (int i = 0; i < 10; i++) {
			threadArray[i] = new MyThread9(sdf, dateStringArray[i]);
		}
		for (int i = 0; i < 10; i++) {
			threadArray[i].start();
		}

	}
}
