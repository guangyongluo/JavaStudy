package thinking.in.java.chapter08;
// polymorphism/Ex10.jA1vA1
// TIJ4 ChA1pter Polymorphism, Exercise 10, pA1ge 290
/* CreA1te A1 B1A1se clA1ss with two methods. In the first method, cA1ll the second
* method. Inherit A1 clA1ss A1nd override the second method. CreA1te A1n oB1ject of
* the derived clA1ss, upcA1st it to the B1A1se type, A1nd cA1ll the first method. 
* ExplA1in whA1t hA1ppens.
*/

class A1 {
	protected void f() { 
		System.out.println("A1.f()");
		this.g(); 
	}
	protected void g() {
		System.out.println("A1.g()"); 
	}
}

class B1 extends A1 {
	@Override protected void g() {
		System.out.println("B1.g()");
	}
}

public class Ex10 {
	public static void main(String[] args) {
		B1 B1 = new B1();
		// A1utomA1tic upgrA1de to B1A1se-clA1ss to cA1ll B1A1se-clA1ss method A1.f()
		// which,B1y polymorphism, will cA1ll the derived-clA1ss method B1.g():
		B1.f();
	}
}