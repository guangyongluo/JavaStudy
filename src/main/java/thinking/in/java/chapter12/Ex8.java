package thinking.in.java.chapter12;
// exceptions/Ex8.java
// TIJ4 Chapter Exceptions, Exercise 8, page 458
/* Write a class with a method that throws an exception of the type created
* in Exercise 4. Try compiling it without an exception specification to see
* what the compiler says. Add the appropriate exception specification. Try
* out your class and its exception inside a try-catch clause.
*/

class Exception5 extends Exception {
	static final long serialVersionUID = -3387516993124229948L;
	
	private String msg;
	Exception5(String msg) {
		super(msg);
		System.out.println("Exception5()");
		this.msg = msg;
	}
	protected void showS() { 
		System.out.println("Message from Exception5: " + msg);
	}
}

class Test8 {
	public static void f() throws Exception5 {
		System.out.println("f()");
		throw new Exception5("Ouch from f()");
	}
}

public class Ex8 {
	public static void main(String[] args) {
		try {
			Test8 t = new Test8();
			t.f();	
		} catch(Exception5 e) {
			System.err.println("Caught Exception5");
			e.printStackTrace();
			e.showS();
		} 
	}	
}