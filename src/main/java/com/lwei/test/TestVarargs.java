package com.lwei.test;

public class TestVarargs {

	private static int sum(int... nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum;
	}
	
	private static void m1(String s, String... ss) {
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }

	public static void main(String[] args) {
		int sum = 0;
		sum = sum(1, 2);
		System.out.println(sum);
		sum = sum(1, 2, 3);
		System.out.println(sum);
		
		m1("");
        m1("aaa");
        m1("aaa", "bbb");
	}

}
