package com.lwei.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest01 {

	/**
	 * index.do?itemId=1&userId=10000&type=20&token=111111111111&key=index
	 */
	
	public void test1() {
		String queryString = "itemId=1&userId=10000&type=20&token=111111111111&key=index";
		Map<String, String> params = Stream.of(queryString.split("&")).map(str -> str.split("=")).collect(Collectors.toMap(s -> s[0], s -> s[1]));
		System.out.println(params);
	}
	
	
	public void test2 () {
		List<Integer> ids = books().stream().map( book -> book.getId()).collect(Collectors.toList());
		System.out.println(ids);
		
		ids = books().stream().map(Book::getId).collect(Collectors.toList());
		System.out.println(ids);
		
		String str = books().stream().map(book -> book.getId()+"").collect(Collectors.joining(","));
		System.out.println(str);
		
		str = books().stream().map(book -> book.getId()+"").collect(Collectors.joining(",", "(", ")"));
		System.out.println(str);
		
		str = books().stream().map(book -> "'"+book.getId()+"'").collect(Collectors.joining(",", "(", ")"));
		System.out.println(str);
	}
	
	
	public void test3 () {
		List<String> list = books().stream().map(Book::getType).collect(Collectors.toList());
		System.out.println(list);
		
		list = books().stream().map(Book::getType).distinct().collect(Collectors.toList());
		System.out.println(list);
		
		Set<String> set = books().stream().map(Book::getType).collect(Collectors.toSet());
		System.out.println(set);
	} 
	
	
	public void test4 () {
//		books().stream().sorted((book1, book2) -> Double.compare(book1.getPrice(), book2.getPrice())).forEach(System.out::println);;
		
//		Comparator<Book> compa = (book1, book2) -> Double.compare(book1.getPrice(), book2.getPrice());
//		books().stream().sorted(compa.reversed()).forEach(System.out::println);
	
//		Comparator<Book> compa = (book1, book2) -> Double.compare(book1.getPrice(), book2.getPrice());
//		books().stream().sorted(compa.thenComparing((book1,book2) -> book1.getPublishDate().isAfter(book2.getPublishDate()) ? -1 : 1)).forEach(System.out::println);
		
//		books().stream().sorted(Comparator.comparing(Book::getPrice)).forEach(System.out::println);
//		books().stream().sorted(Comparator.comparing(Book::getPrice).reversed()).forEach(System.out::println);
		books().stream().sorted(Comparator.comparing(Book::getPrice).reversed().thenComparing(Comparator.comparing(Book::getPublishDate).reversed())).forEach(System.out::println);
	}
	
	
	public void test5 () {
//		Map<Integer, Book> booksMap = books().stream().collect(Collectors.toMap(book -> book.getId(), book -> book));
//		System.out.println(booksMap);
		
		Map<Integer, Book> booksMap = books().stream().collect(Collectors.toMap(Book::getId, book -> book));
		System.out.println(booksMap);
	}
	
	
	public void test6 () {
		Double avg = books().stream().collect(Collectors.averagingDouble(Book::getPrice));
		System.out.println(avg);
	}
	
	
	public void test7 () {
		Optional<Book> book = books().stream().collect(Collectors.maxBy(Comparator.comparing(Book::getPrice)));
		System.out.println(book);
		
		book = books().stream().collect(Collectors.minBy(Comparator.comparing(Book::getPrice)));
		System.out.println(book);
		
		book = books().stream().collect(Collectors.minBy(Comparator.comparing(Book::getPublishDate)));
		System.out.println(book);
		
		book = books().stream().collect(Collectors.maxBy(Comparator.comparing(Book::getPublishDate)));
		System.out.println(book);
		
		Comparator<Book> comp = Comparator.comparing(Book::getPrice);
		book = books().stream().collect(Collectors.maxBy(comp.thenComparing(Comparator.comparing(Book::getPublishDate))));
		System.out.println(book);
	}
	
	
	public void test8 () {
//		Map<String, List<Book>> booksMap = books().stream().collect(Collectors.groupingBy(Book::getType));
//		booksMap.keySet().forEach(key -> {
//			System.out.println(key);
//			System.out.println(booksMap.get(key));
//			System.out.println("---------------------");
//		});
//		
//		Map<String, Long> booksCount = books().stream().collect(Collectors.groupingBy(Book::getType, Collectors.counting()));
//		System.out.println(booksCount);
		
//		Map<String, Double> booksSum = books().stream().collect(Collectors.groupingBy(Book::getType, Collectors.summingDouble(Book::getPrice)));
//		System.out.println(booksSum);
		
//		Map<String, Double> booksSum = books().stream().collect(Collectors.groupingBy(Book::getType, Collectors.averagingDouble(Book::getPrice)));
//		System.out.println(booksSum);
		
//		Map<String, Optional<Book>> booksMaxPrice = books().stream().collect(Collectors.groupingBy(Book::getType, Collectors.maxBy(Comparator.comparing(Book::getPrice))));
//		System.out.println(booksMaxPrice);
//		
//		Map<String, Optional<Book>> booksMinPrice = books().stream().collect(Collectors.groupingBy(Book::getType, Collectors.minBy(Comparator.comparing(Book::getPrice))));
//		System.out.println(booksMinPrice);
		
		Map<String, Optional<Book>> booksMaxPubDate = books().stream().collect(Collectors.groupingBy(Book::getType, Collectors.maxBy(Comparator.comparing(Book::getPublishDate))));
		System.out.println(booksMaxPubDate);
	}
	
	
	public void test9 () {
		books().stream().filter(book -> book.getPrice() >= 80).sorted(Comparator.comparing(Book::getPublishDate).reversed()).forEach(System.out::println);;
	}
	
	private List<Book> books(){
		List<Book> books = new ArrayList<>();
		books.add(new Book(1, "tomcat", 70d, "服务器", LocalDate.parse("2014-05-17")));
		books.add(new Book(2, "jetty", 60d, "服务器", LocalDate.parse("2015-12-01")));
		books.add(new Book(3, "nginx", 65d, "服务器", LocalDate.parse("2016-10-17")));
		books.add(new Book(4, "java", 66d, "编程语言", LocalDate.parse("2011-04-09")));
		books.add(new Book(5, "ruby", 80d, "编程语言", LocalDate.parse("2013-05-09")));
		books.add(new Book(6, "php", 40d, "编程语言", LocalDate.parse("2014-08-06")));
		books.add(new Book(7, "html", 44d, "编程语言", LocalDate.parse("2011-01-06")));
		books.add(new Book(8, "oracle", 150d, "数据库", LocalDate.parse("2013-08-09")));
		books.add(new Book(9, "mysql", 66d, "数据库", LocalDate.parse("2015-04-06")));
		books.add(new Book(10, "ssh", 70d, "编程语言", LocalDate.parse("2016-12-04")));
		books.add(new Book(11, "设计模式", 81d, "其他", LocalDate.parse("2017-04-06")));
		books.add(new Book(12, "重构", 62d, "其他", LocalDate.parse("2012-04-09")));
		books.add(new Book(13, "敏捷开发", 72d, "其他", LocalDate.parse("2016-09-07")));
		books.add(new Book(14, "从技术到管理", 42d, "其他", LocalDate.parse("2016-02-19")));
		books.add(new Book(15, "算法导论", 66d, "其他", LocalDate.parse("2010-05-08")));
		books.add(new Book(16, "oracle 12c", 150d, "数据库", LocalDate.parse("2017-05-08")));
		return books;
	}
}
