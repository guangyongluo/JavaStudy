package thinking.in.java.chapter04;
// control/IfEsleTest.java
// TIJ4 Chapter Control, Exercise 6, page 144
/* Modify the two test() methods in the previous two programs so that they take
* two extra arguments begin and end, and so that testval is tested to see if it
* is within the range between (and including) begin and end.
*/

public class IfElseTest {
	static int test(int testval, int begin, int end) {
		if(end < begin) {
			System.out.println("end cannot be < begin");
			return 0;
		} 
		if((testval > (begin - 1)) && (testval < (end + 1))) 
			return +1;
		if((testval < begin) || (testval > end))
			return -1;
		System.out.println("exceptional case");
		return 13;
	}	
	public static void main(String[] args) {
		System.out.println(test(10, 5, 4));
		System.out.println(test(5, 4, 10));
		System.out.println(test(5, 5, 6));
		System.out.println(test(10, 5, 7));	
		System.out.println(test(5, 5, 5));	
	}
}