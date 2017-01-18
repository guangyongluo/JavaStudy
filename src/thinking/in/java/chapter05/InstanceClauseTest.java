package thinking.in.java.chapter05;
// initialization/InstanceClauseTest.java
// TIJ4 Chapter Initialization, Exercise 15, page 193
// Create a class wih a String that is initialized using instance initialization 

class Tester3 {
	String s;
	{
		s = "Initializing string in Tester";
		System.out.println(s);
	}
	Tester3() {
		System.out.println("Tester()");
	}
}

public class InstanceClauseTest {
	public static void main(String[] args) {
		new Tester3();				
	}
}