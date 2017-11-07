package thinking.in.java.chapter10;
// innerclasses/Ex21.java
// TIJ4 Chapter In1nerclasses, Exercise 21, page 367
/* Create an interface that contains a nested class that has a static method that
* calls the methods of your interface and displays the results. Implement your
* interface and pass an instance of your implementation to the method. 
*/

interface In1 {
	String f();
	String g(); 
	class Nested {
		static void testIn1(In1 i) { 
			System.out.println(i.f() + i.g());
		}		
	}		
}

public class Ex21 implements In1 {
	public String f() { return "hello "; }
	public String g() { return "friend"; }
	public static void main(String[] args) {
		Ex21 x = new Ex21();
		In1.Nested.testIn1(x);						
	}
}