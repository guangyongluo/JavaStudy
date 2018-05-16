package com.lwei.test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	/**
	 * Stream的创建方式
	 */
	
	static void gen1() {
		String[] arr = {"a","b","c","d","e"};
		Stream<String> stream = Stream.of(arr);
		stream.forEach(System.out::println);
	}
	
	static void gen2() {
		List<String> list = Arrays.asList("a","b","c","d");
		Stream<String> stream = list.stream();
		stream.forEach(System.out::println);
	}
	
	static void gen3() {
	    Stream<Integer> stream = Stream.generate(() -> 1);
	    stream.forEach(System.out::println);
	}
	
	static void gen4() {
		Stream<Integer> stream = Stream.iterate(1, x -> x + 1);
		stream.forEach(System.out::println);
	}
	/**
	 * 
	 * @param args
	 */
	
	static void gen5() throws Exception {
		String str = "abcd";
		
		IntStream stream = str.chars();
		
		stream.forEach(System.out::println);
		
		Files.lines(Paths.get("d:/LICENSE.txt")).forEach(System.out::println);
	}
	
	public static void main(String[] args) throws Exception {
//		StreamTest.gen5();
		
//		Arrays.asList(1,2,3,4,5).stream().filter(x -> {
//			System.out.println("22222");
//			return x%2 == 0;
//		}).forEach(System.out::println);
//		
//		Arrays.asList(1,2,3,4,5).stream().filter(x -> x%2 == 0).forEach(System.out::println);
//		int sum = Arrays.asList(1,2,3,4,5).stream().filter(x -> x%2 == 0).mapToInt(x -> x).sum();
//		System.out.println(sum);
//		
//		int max = Arrays.asList(1,2,3,4,5).stream().max((a,b) -> a-b).get();
//		System.out.println(max);
//		
//		int min = Arrays.asList(1,2,3,4,5).stream().min((a,b) -> a-b).get();
//		System.out.println(min);
//		
//		Optional<Integer> op = Arrays.asList(1,2,3,4,5).stream().filter(x -> x%2 == 0).findFirst();
//		System.out.println(op.get());
//		
//		op = Arrays.asList(1,2,3,4,5).stream().sorted((a,b) -> b-a).findFirst();
//		System.out.println(op.get());
		
//		Arrays.asList(7,5,6,9,1,0,3,8,2,4).stream().sorted().forEach(System.out::println);
//		
//		Arrays.asList("com","vilin","cn","net").stream().sorted((a,b) -> a.length() - b.length()).forEach(System.out::println);
		
//		Stream.iterate(1, x -> x + 1).limit(50).filter(x -> x % 2 == 0).forEach(System.out::println);
//		
//		List<Integer> list = Stream.iterate(1, x -> x + 1).limit(50).filter(x -> x % 2 == 0).collect(Collectors.toList());
//		System.out.println(list);
		
//		Arrays.asList(2,5,2,9,1,0,1,8,2,1).stream().distinct().forEach(System.out::println);
		
//		Set<Integer> set = Arrays.asList(2,5,2,9,1,0,1,8,2,1).stream().collect(Collectors.toSet());
//		System.out.println(set);
//		
//		List<Integer> list = Stream.iterate(1, x -> x + 1).limit(50).sorted((a,b) -> b-a).skip(10).collect(Collectors.toList());
//		System.out.println(list);
		
		//把下列字符串分割，依次转换成int，然后求和。
//		String str = "11,22,33,44,55";
//		
//		int sum = Stream.of(str.split(",")).mapToInt(x -> Integer.valueOf(x)).sum();
//		System.out.println(sum);
		
//		String str = "tomcat,nginx,apache,jetty";
//		Stream.of(str.split(",")).map(User::new).forEach(System.out::println);
//		
//		Stream.of(str.split(",")).map(Person::new).forEach(System.out::println);
		
//		Supplier<Child> s = Child::new;
//		
//		List<Child> list = new ArrayList<Child>();
//		list.add(s.get());
//		list.add(s.get());
//		list.add(s.get());
//		list.add(s.get());
//		System.out.println(list);
		
		Optional<Integer> max = Stream.iterate(1, x -> x + 1).limit(200).peek(x -> {
		    System.out.println(Thread.currentThread().getName());	
		}).parallel().max(Integer::compare);
		
		System.out.println(max);
		
		
		
	}
	
}

class User{
	private String name;
	public User(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
}


class Child{
	private int id;
    private static int count = 0;
	
	public Child() {
		id = count++;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "child [id=" + id + "]";
	}
	
}