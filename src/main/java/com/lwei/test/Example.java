package com.lwei.test;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Example extends Base{
	
	public static String put() {
		System.out.println("put method invoke");
		return "hello";
	}
	
	public static void con(Integer size) {
		System.out.println(size);
	}
	
	public static String toUpperCase(String str) {
		return str.toUpperCase();
	}
	
	public static int len(String str1, String str2) {
		return str1.length() + str2.length();
	}
	
	public void p(int size) {
		System.out.println(size);
	}

	public String toUpper(String str) {
		return str.toUpperCase();
	}
	
	public void test() {
		Function<String, String> fff = this::toUpper;
		System.out.println(fff.apply("current to upper"));
		Function<String, String> ffff = super::toUpper;
		System.out.println(ffff.apply("super to upper"));
	}
	
	public static void main(String[] args) {
	
		//输入一个字符串，返回输入字符串的大写 aaa -> AAA
		Function<String, String> fn = str -> str.toUpperCase();
		
		System.out.println(fn.apply("admin"));
	
		Consumer<String> c = arg -> {System.out.println(arg);};
		c.accept("hello");
		
		/**
		 * 静态方法引用
		 */
		Supplier<String> s = () -> Example.put();
		System.out.println(s.get());
		Supplier<String> ss = Example::put;
		System.out.println(ss.get());
		Supplier<String> sss = () -> Fun.ret();
		System.out.println(sss.get());
		Supplier<String> ssss = Fun::ret;
		System.out.println(ssss.get());
		
		Consumer<Integer> cc = (size) -> Example.con(size);
		cc.accept(50);
		Consumer<Integer> ccc = Example::con;
		ccc.accept(100);
		
		Function<String, String> f1 = str -> str.toUpperCase();
		Function<String, String> f2 = str -> Example.toUpperCase(str);
		Function<String, String> f3 = Example::toUpperCase;
		Function<String, String> f4 = Fun::toUpperCase;
		System.out.println(f3.apply("lambda"));
		System.out.println(f4.apply("lambda"));
		
		BiFunction<String, String, Integer> bf = (str1, str2) -> str1.length() + str2.length();
		System.out.println(bf.apply("lwei", "lwei"));
		BiFunction<String, String, Integer> bff = (str1, str2) -> Example.len(str1, str2);
		System.out.println(bff.apply("luowei", "luowei"));
		BiFunction<String, String, Integer> bfff = Example::len;
		System.out.println(bfff.apply("guangyongluo", "guangyongluo"));
		
		/**
		 * 实例方法引用
		 */
		Example example = new Example();
		Consumer<Integer> c1 = size -> example.p(size);
		Consumer<Integer> c2 = example::p;
		
		Function<String, String> f = str -> str.toUpperCase();
		Function<String, String> ff = example::toUpper;
		System.out.println(ff.apply("iloveyou"));
		
		example.test();
	}
}

class Fun{
	public static String ret() {
		System.out.println("put method invoke");
		return "hello";
	}
	
	public static String toUpperCase(String str) {
		return str.toUpperCase();
	}
}

class Base {
	
	public String toUpper(String str) {
		return str.toUpperCase();
	}
}
