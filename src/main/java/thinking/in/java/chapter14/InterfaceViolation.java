package thinking.in.java.chapter14;
//: typeinfo/InterfaceViolation.java
// Sneaking around an interface.

class B0 implements A {
  public void f() {}
  public void g() {}
}

public class InterfaceViolation {
  public static void main(String[] args) {
    A a = new B0();
    a.f();
    // a.g(); // Compile error
    System.out.println(a.getClass().getName());
    if(a instanceof B0) {
      B0 b = (B0)a;
      b.g();
    }
  }
} /* Output:
B0
*///:~
