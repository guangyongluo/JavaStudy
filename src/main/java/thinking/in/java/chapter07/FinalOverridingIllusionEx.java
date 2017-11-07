package thinking.in.java.chapter07;
// reusing/FinalOverridingIllusionEx.java
// TIJ4 Chapter Reusing, Exercise 20, page 269
// Show that the @Override annotation solves the problem in ths section

class WithFinals {
	// Identical to private alone:
	private final void f() { System.out.println("WithFinals.f()"); }
	// Also automatically "final":
	private void g() { System.out.println("WithFinals.g()"); }
} 

class OverridingPrivate extends WithFinals {
	// attempt to override:
	private final void f() { System.out.println("OverridingPrivate.f()"); }
	private void g() { System.out.println("OverridingPrivate.g()"); }
	// @Override: compiler finds error - does NOT override
	// @Override private final void f() { System.out.println("OverridingPrivate.f()"); }
	// @Override private void g() { System.out.println("OverridingPrivate.g()"); }
}

class OverridingPrivate2 extends OverridingPrivate {
	// attempt to override:
	public final void f() { System.out.println("OverridingPrivate2.f()"); }
	public void g() { System.out.println("OverridingPrivate2.g()"); }
	// use @Override so compiler with say "does NOT override or implement"
	// @Override public final void f() { System.out.println("OverridingPrivate2.f()"); }
	// @Override public void g() { System.out.println("OverridingPrivate2.g()"); }
}

public class FinalOverridingIllusionEx {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		// You can upcast:
		OverridingPrivate op = op2;
		// But you can't call the methods:
		//! op.f(); // f() has private access in OverridingPrivate
		//! op.f();
		// Same here:
		WithFinals wf = op2;
		//! wf.f(); // f() has private access in WithFinals
		//! wf.g();
	}
}
