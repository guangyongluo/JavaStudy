package thinking.in.java.chapter05;
// initialization/ExplicitStaticEx.java
// TIJ4 Chapter Initialization, Exercise 14, page 191
/* Create class with static String field initialized at point of definition and
* another one initialized by the static block.  Add static method that System.out.printlns
* both fields and demonstrates that they are both initialized before thay are
* used.
*/

class Go {
	static String s1 = "run";
	static String s2, s3;
	static {
		s2 = "drive car";
		s3 = "fly plane";
		System.out.println("s2 & s3 initialized");
	}
	static void how() {
		System.out.println(s1 + " or " + s2 + " or " + s3);
	}
	Go() { System.out.println("Go()"); }	
}

public class ExplicitStaticEx {
	public static void main(String[] args) {
		System.out.println("Inside main()");
		Go.how();
		System.out.println("Go.s1: " + Go.s1);		
	}
	static Go g1 = new Go();
	static Go g2 = new Go();
}