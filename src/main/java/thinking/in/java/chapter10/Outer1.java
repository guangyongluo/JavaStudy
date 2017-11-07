package thinking.in.java.chapter10;

import com.lwei.test.Inner;

public class Outer1 {
	class Inner {
		Inner() {
			System.out.println("Inner()");
		}
	}

	Outer1() {
		System.out.println("Outer1()");
	}

	// make an Inner from within a non-static method of outer class:
	Inner makeInner() {
		return new Inner();
	}

	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Outer1.Inner i = o.makeInner();
		Outer1.Inner i2 = o.new Inner();
		Inner i3 = new Inner();
	}
}