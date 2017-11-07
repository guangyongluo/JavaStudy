package com.lwei.generic;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		String[] names = { "孙悟空", "猪八戒", "沙悟净" };
		List<String> list = new ArrayList<String>();
		Needs needs = new Needs();
		// needs.copy(names, list);

		needs.copyFromArrayToCollection(names, list);
	}
}
