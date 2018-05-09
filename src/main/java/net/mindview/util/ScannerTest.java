package net.mindview.util;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//读入第一行字符串
		String next1 = scanner.next();
		System.out.println(next1);
		//读入第二行字符串
		String next2 = scanner.next();
		System.out.println(next2);
		
//		String next3 = scanner.next();
//		System.out.println(next3);
		
		System.out.println("next()方法结束");
		
		String nextLine = scanner.nextLine();
		System.out.println(nextLine);
		
		System.out.println("nextLine()方法结束");
		
		System.out.println("Java Scanner默认使用的分割符为：" + scanner.delimiter());
		System.out.println("\\p{javaWhitespace}+等效于 java.lang.Character.isWhitespace()");
		
		nextLine = scanner.nextLine();
		System.out.println(nextLine);
		nextLine = scanner.nextLine();
		System.out.println(nextLine);
		scanner.close();
	}
	
}
