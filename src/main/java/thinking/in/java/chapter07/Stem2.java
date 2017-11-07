package thinking.in.java.chapter07;
// reusing/Stem2.java
// TIJ4 Chapter Reusing, Exercise 12, page 254
// Add a proper hierarchy of dispose() methods to all the classes of exercise 9. 
/* EX 9: Create a class called Root that contains an instance of each of the classes
* (that you also create) named Component1, Component2 and Component3. Derive a 
* class Stem from Root that also contains an instance of each "component." All 
* classes should have default constructors that print a message about that class.
*/

class Component111 {
	Component111() { System.out.println("Component1()"); }
	void dispose() { System.out.println("Component1.dispose()"); }
}

class Component222 {
	Component222() { System.out.println("Component2()"); }
	void dispose() { System.out.println("Component2.dispose()"); }
}

class Component333 {
	Component333() { System.out.println("Component3()"); }
	void dispose() { System.out.println("Component3.dispose()"); }
}

class Root2 { 
	Component111 c1root;
	Component222 c2root;
	Component333 c3root;
	Root2() { 
		System.out.println("Root()");
		c1root = new Component111();
		c2root = new Component222();
		c3root = new Component333();
	}
	void dispose() {
		c3root.dispose();
		c2root.dispose();
		c1root.dispose();
		System.out.println("Root2.dispose()");
	} 
}

class Stem2 extends Root2 { 
	Component111 c1stem;
	Component222 c2stem;
	Component333 c3stem;
	Stem2() { 
		super();
		System.out.println("Stem2()"); 
		c1stem = new Component111();
		c2stem = new Component222();
		c3stem = new Component333();
	}
	void dispose() {
		c3stem.dispose();
		c2stem.dispose();
		c1stem.dispose();
		super.dispose();
		System.out.println("Stem2.dispose()");
	} 
	public static void main(String[] args) {
		Stem2 s = new Stem2();
		try {
			// Code and exception handling...
		} finally {
			s.dispose();
		}
	}
}
