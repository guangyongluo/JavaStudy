package com.lwei.test;

import java.io.Closeable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class App { 

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        
        Runnable r = () -> {};
        Closeable c = () -> {
            //业务逻辑
        };
        
        Consumer<String> c1 = (a) -> {};
        Consumer<String> c2 = a -> {};
        Consumer<String> c3 = (String a) -> {};
        
        Supplier<String> s1 = () -> "hello";
        Supplier<String> s2 = () -> {
        	return "hello";
        };
        
        Function<String, Integer> f1 = (str) -> {
            return	Integer.valueOf(str);
        };
        Function<String, Integer> f2 = (String str) -> Integer.valueOf(str);
        Function<String, Integer> f3 = (str) -> Integer.valueOf(str);
	}
	
}
