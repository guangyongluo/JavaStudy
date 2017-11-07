package com.lwei.annotation;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SuppressWarningsTest {

	@SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
	public static void main(String[] args) {
		Map map = new HashMap();

		map.put("Hello", new Date());

		System.out.println(map.get("Hello"));

		DeprecatedTest dt = new DeprecatedTest();
		dt.doSomething();
	}
}
