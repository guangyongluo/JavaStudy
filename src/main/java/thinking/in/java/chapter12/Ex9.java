package thinking.in.java.chapter12;
// exceptions/Ex9.java
// TIJ4 Chapter Exceptions, Exercise 9, page 460
/* Create three new types of exceptions. Write a class with a method that
* throws all three. In main(), call the method but only use a single catch
* clause that will catch all three types of exceptions.
*/
import static net.mindview.util.Print.*;

class ExceptionA1 extends Exception {
	ExceptionA1(String msg) { super(msg); } 	
}

class ExceptionB1 extends Exception {
	ExceptionB1(String msg) { super(msg); } 	
}

class ExceptionC1 extends Exception {
	ExceptionC1(String msg) { super(msg); } 		
}

public class Ex9 {
	public static void f(int x) throws ExceptionA1, ExceptionB1, ExceptionC1 {
		if(x < 0) throw new ExceptionA1("x < 0");
		if(x == 0) throw new ExceptionB1("x == 0");
		if(x > 0) throw new ExceptionC1("x > 0");
	}
	public static void main(String[] args) {
		try {
			f(0);
			f(1);
			f(-1);
		// will catch any Exception type:
		} catch(Exception e) {
			print("Caught Exception");
			e.printStackTrace(System.out);
		} 
	}	
}