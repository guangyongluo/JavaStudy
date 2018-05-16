package com.lwei.lambda;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest {

	public static void test1() {
		String queryString = "itemId=1&userId=10000&type=20&token=1111111111&key=index";
		
		Map<String, String> params = Stream.of(queryString.split("&")).map(str -> str.split("=")).collect(Collectors.toMap(x -> x[0], x -> x[1]));
		System.out.println(params);
	}
	
	public static void main(String[] args) {
		test1();
	}
	
}
