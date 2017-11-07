package com.lwei.test;

public class TestVarargs {

	private static int sum(int... nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		int sum = 0;
		sum = sum(1, 2);
		System.out.println(sum);
		sum = sum(1, 2, 3);
		System.out.println(sum);
	}

}
