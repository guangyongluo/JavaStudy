package com.lwei.test;

import java.util.Calendar;

public class CanlenderTest {

	public static void main(String[] args) {

		Calendar calendarRef = Calendar.getInstance();
		System.out.println(calendarRef);
		calendarRef.add(Calendar.HOUR, 2);
		System.out.println(calendarRef);

	}
}
