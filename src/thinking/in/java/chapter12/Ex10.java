package thinking.in.java.chapter12;
// exceptions/Ex10.java
// TIJ4 Chapter Exceptions, Exercise 10, page 468
/* Create a class with two methods, f() and g(). In g(), throw an exception of
* a new type that you define. In f(), call g(), catch its exception and, in the
* catch clause, throw a different exception (of a second type that you define).
* Test your code in main().
*/

class GException extends Exception {
	GException(String s) { super(s); }
}

class HException extends Exception {
	HException(String s) { super(s); }
}

public class Ex10 {
	static void f() {
		try {
			try {
				g();
			} catch(GException ge) {
				System.out.println("Caught GException in f inner try");
				ge.printStackTrace();
				throw new HException("from f(), inner try");
			}
		} catch(HException he) {
			System.out.println("Caught HException in f() outer try");
			he.printStackTrace(System.out);
		}
	}
	static void g() throws GException {
		throw new GException("from g()");
	}
	public static void main(String[] args) {
		f();
	}	
}

	