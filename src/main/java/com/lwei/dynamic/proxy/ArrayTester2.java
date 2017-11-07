package com.lwei.dynamic.proxy;

import java.lang.reflect.Array;

public class ArrayTester2 {

	public static void main(String[] args) {

		int[] dims = new int[] { 5, 10, 15 };
		Object array = Array.newInstance(Integer.TYPE, dims);
		Object arrayObj = Array.get(array, 3);
		Class<?> cls = arrayObj.getClass().getComponentType();
		System.out.println(cls);
		arrayObj = Array.get(arrayObj, 5);
		Array.setInt(arrayObj, 10, 37);
		int[][][] arrayInt = (int[][][]) array;
		System.out.println(arrayInt[3][5][10]);
	}
}
