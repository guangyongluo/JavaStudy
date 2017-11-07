package thinking.in.java.chapter19;

//: enumerated/E02_EnumStaticImplementation.java
/****************** Exercise 2 *****************
* Instead of implementing an interface, make
* next() a static method. What are the benefits
* and drawbacks of this approach?
***********************************************/

import java.util.Random;

enum CartoonCharacter2 {
	SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
	private static Random rand = new Random(47);

	public static CartoonCharacter2 next() {
		return values()[rand.nextInt(values().length)];
	}
}

public class E02_EnumStaticImplementation {
	public static void printNext() {
		System.out.print(CartoonCharacter2.next() + ", ");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			printNext();
	}
}
