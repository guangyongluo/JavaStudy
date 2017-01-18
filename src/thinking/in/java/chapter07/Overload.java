package thinking.in.java.chapter07;
// reusing/Overload.java
// TIJ4 Chapter Reusing, Exercise 13, page 256
/* Create a class with a method that is overloaded three times. Inherit a new 
* class, add a new overloading of the method, and show that all four methods are
* available in the derived class.
*/

class ThreeWay {
	void number(byte b) { System.out.println(b); }
	void number(short s) { System.out.println(s); }
	void number(int i) { System.out.println(i); }
}

class Overload extends ThreeWay {
	void number(float f) { System.out.println(f); }
	public static void main(String[] args) {
		Overload ov = new Overload();
		ov.number((byte)0);
		ov.number((short)1);
		ov.number(2);
		ov.number(3.0f);
	}
}