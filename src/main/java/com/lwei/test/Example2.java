package com.lwei.test;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Example2 extends Base{
	
	/**
	 * 抽象方法没有输入参数，不能使用对象方法引用比如说如下的函数接口
	 */
	public void not() {
		Runnable run = () -> {};
		Closeable c = () -> {};
		Supplier<String> s = () -> "";
	}
	
	public static void main(String[] args) {
		/**
		 * 对象方法引用例子
		 */
        Consumer<Too> c1 = (Too too) -> new Too().foo();
        Consumer<Too> c2 = (Too too) -> new Too2().foo();
        Consumer<Too> c3 = Too::foo;
        c3.accept(new Too());
        
        BiConsumer<Too2, String> c5 = (too2, str) -> new Too2().fo(str);
        BiConsumer<Too2, String> c6 = Too2::fo;
        
        BiFunction<Foo, String, Integer> bf1 = (foo, str) -> new Foo().fo(str);
        System.out.println(bf1.apply(new Foo(), "hello"));
        BiFunction<Foo, String, Integer> bf2 = Foo::fo;
        System.out.println(bf1.apply(new Foo(), "world"));
        
        /**
         * 构造方法引用例子
         */
        Supplier<Person> s1 = () -> new Person();
        Supplier<Person> s2 = Person::new;
        
        
        Supplier<List> s3 = ArrayList::new;
        Supplier<Thread> s4 = Thread::new;
        Supplier<Set> s5 = HashSet::new;
        Supplier<String> s6 = String::new;
        
        Consumer<Integer> c = Account::new;
        c.accept(100);
        Consumer<Integer> cc = (age) -> new Account();
        c.accept(200);
        Consumer<Integer> ccc = (age) -> new Account(age);
        c.accept(300);
	}
}

class Account {
	
	public Account() {
		System.out.println("Account()");
	}
	
	public Account(int age) {
		System.out.println("Account(age)");
	}
}

class Too {
	public void foo() {
		System.out.println("invoke");
	}
}

class Too2 {
	public void foo() {
		System.out.println("invoke");
	}
	
	public void fo(String str) {
		System.out.println(str);
	}
}

class Foo{
	public int fo(String str) {
		System.out.println(str);
		return 100;
	}
}

class Person {
	public Person() {
		System.out.println("new Person()");
	}
}