package thinking.in.java.chapter10;
// innerclasses/Ex6.java
// TIJ4 Chapter Innerclasses, Exercise 6, page 353
/* Create an interface with at least one method, in its own package. Create
* a class in a separate package. Add a protected inner class that 
* implements the interface. In a third package, inherit from your class and
* inside a method, return an object of the protected inner class, upcasting
* to the interface during the return.
*/

/* // in separate package:
*/
interface Ex6Interface {
	String say();
}

// and in a second package:
class Ex6Base {
	protected class Ex6BaseInner implements Ex6Interface {
		// need public constructor to create one in Ex6Base child: 
		public Ex6BaseInner() { }
		public String say() { return "Hi"; }
	}
}

public class Ex6 extends Ex6Base {
	Ex6Interface getBaseInner() { 
		return this.new Ex6BaseInner();
	}
	public static void main(String[] args) {
		Ex6 ex = new Ex6();
		System.out.println(ex.getBaseInner().say());
	}	
}