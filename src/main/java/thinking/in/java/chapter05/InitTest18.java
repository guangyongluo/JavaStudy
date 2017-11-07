package thinking.in.java.chapter05;
// initialization/InitTest18.java
// TIJ4 Chapter Initialization, Exercise 18, page 198
/* Attach objects to the references in array in exercise 17: Create a class with
* a constructor that takes a String argument. During constriction, print the
* argument. Create and array of object references to this class, but don't
* actually create objects to assign into the array. When you run the program,
* notice whether the initialization messages from the constructor are printed.
*/

public class InitTest18 {
	public static void main(String[] args) {
		InitTest[] it = new InitTest[5];
		for(int i = 0; i < it.length; i++)
			it[i] = new InitTest(Integer.toString(i));
	}
}