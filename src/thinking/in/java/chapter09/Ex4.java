package thinking.in.java.chapter09;
// interfaces/Ex4.java
// TIJ4 Chapter Interfaces, Exercise 4, page 315
/* Create an abstract class with no methods. Derive a class and add a method. 
* Create a static method that takes a reference to the base class, downcasts
* it to the derived class, and calls the method. In main(), demonstrate that it
* works. Now put the abstract declaration for the method in the base class, thus
* eliminating the need for the downcast.
*/ 

abstract class Dad1 {
}

class Son1 extends Dad1 {
	protected void print() { System.out.println("Son1"); }
}

abstract class SecondDad1 {
	abstract protected void print();
}

class SecondSon1 extends SecondDad1 {
	protected void print() { System.out.println("SecondSon1"); }
}

public class Ex4 {
	public static void testPrint(Dad1 d) {
		((Son1)d).print();
	}
	public static void secondTestPrint(SecondDad1 sd) {
		sd.print();
	}
	public static void main(String[] args) {
		Son1 s = new Son1();
		Ex4.testPrint(s);
		SecondSon1 ss = new SecondSon1();
		Ex4.secondTestPrint(ss);			
	}
}