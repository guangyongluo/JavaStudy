package com.lwei.test;

public class Test1 {

	public static void main(String[] args) {
		while (true) {
			String s = "" + Math.random();
			// System.out.println(s);
			// System.out.println(s.substring(0, 8).equals("0.123456"));
			if (s.substring(0, 8).equals("0.123456")) {
				System.out.println("i am out");
				break;
			}
		}
	}
}
