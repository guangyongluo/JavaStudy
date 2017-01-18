package thinking.in.java.chapter03;
//: operators/CoinToss.java
// TIJ4 Chapter Operators, Exercise 7, page 106
// Write a program that simulates coin-flipping

import java.util.*; 

public class CoinToss {
	public static void main(String[] args) {
		Random rand = new Random();
		int coin = rand.nextInt();
		if(coin % 2 == 0) System.out.println("heads");
		else System.out.println("tails");		
	}
}