package thinking.in.java.chapter07;
// reusing/E.java
// TIJ4 Chapter Reusing, Exercise 4, page 245
/* Prove that base-class constructors are (a) always called and (b) called before
* derived-class constructors.
*/

class A3 { A3(){ System.out.println("A3()");} }

class B3 extends A3 { B3(){ System.out.println("B3()");} }

class C3 extends B3 { C3(){ System.out.println("C3()");} }

class D3 extends C3 {
	D3() { System.out.println("D3()"); }
	public static D3 makeD() { return new D3(); }
	public static void main(String[] args) {
		D3 d = new D3();
		D3 d2 = makeD();
	}
}

public class E3 extends D3 {
	E3() { System.out.println("E3()"); } 
	public static void main(String[] args) {
		E3 e = new E3();
		// test D:
		D3.main(args);
	}
}
