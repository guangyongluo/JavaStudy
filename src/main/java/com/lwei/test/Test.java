package com.lwei.test;

import static com.lwei.test.Common.COUNTRY;
import static com.lwei.test.Common.add;

import java.util.TreeSet;

public class Test {

	private static int i;

	public Contents contents(Destination det) {
		return new Contents() {

			public int j;

			public int getJ() {
				return j;
			}

			public void setJ(int j) {
				this.j = j;
			}

			public void print() {
				System.out.println(det);
			}

		};
	}

	public static int[] values() {
		return new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	}

	public static void testI() {
		i += 1;
	}

	public static void main(String[] args) {
		Destination det = new Destination();
		Test t = new Test();
		Contents c = t.contents(det);
		System.out.println("super class i = " + c.getI());
		// System.out.println("sub class j = " + c.getJ());
		// System.out.println("Destination in Contents : " + c.getDet());
		System.out.println(add(1, 2));
		System.out.println(COUNTRY);
		System.out.println(values()[5]);

		Integer[] a = null;
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.toArray(a);
		for (Integer figure : set) {
			a[i++] = figure;
		}
	}

}
