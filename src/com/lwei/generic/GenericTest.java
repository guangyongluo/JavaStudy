package com.lwei.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		l.add("孙悟空");
		l.add(18);
		for (Object object : l) {
			String str = (String) object;
			System.out.println(object);
		}

		Person<String> person = new Person<String>();
	}

}
