package thinking.in.java.chapter04;
// control/BitTest.java
// TIJ4 Chapter Control, Exercise 5, page 140
/* Repeat exercise 10 from the last chapter using the ternary operator and a
* bitwise test to display the ones and zeros, instead of Integer.toBinaryString()
*/ 


public class BitTest {
	static void binaryPrint (int q) {
		if(q == 0) System.out.print(0);
		else {
			int nlz = Integer.numberOfLeadingZeros(q); 
			q <<= nlz;
			for(int p = 0; p < 32 - nlz; p++) {
				int n = (Integer.numberOfLeadingZeros(q) == 0) ? 1 : 0;
				System.out.print(n);		
				q <<= 1;
			}		
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		int i = 1 + 4 + 16 + 64;
		int j = 2 + 8 + 32 + 128;
		int k = 0x100;
		int m = 0;
		System.out.println("Using Integer.toBinaryString():");
		System.out.println("i = " + Integer.toBinaryString(i));
		System.out.println("j = " + Integer.toBinaryString(j));
		System.out.println("k = " + Integer.toBinaryString(k));
		System.out.println("m = " + Integer.toBinaryString(m));		
		System.out.println("i & j = " + (i & j) + " = " + Integer.toBinaryString(i & j));
		System.out.println("i | j = " + (i | j) + " = " + Integer.toBinaryString(i | j));
		System.out.println("i ^ j = " + (i ^ j) + " = " + Integer.toBinaryString(i ^ j));
		System.out.println("~i = " + Integer.toBinaryString(~i));
		System.out.println("~j = " + Integer.toBinaryString(~j));
		System.out.println("Using binaryPrint():");
		System.out.println("i = " + i + " = ");
		binaryPrint(i);		
		System.out.println("j = " + j + " = ");
		binaryPrint(j);
		System.out.println("k = " + k + " = ");
		binaryPrint(k);		
		System.out.println("m = " + m + " = ");
		binaryPrint(m);
		System.out.println("i & j = " + (i & j) + " = ");
		binaryPrint(i & j);
		System.out.println("i | j = " + (i | j) + " = ");
		binaryPrint(i | j);
		System.out.println("i ^ j = " + (i ^ j) + " = ");
		binaryPrint(i ^ j);
		System.out.println("~i = " + ~i + " = ");
		binaryPrint(~i);		
		System.out.println("~j = " + ~j + " = ");
		binaryPrint(~j);
	}	
}