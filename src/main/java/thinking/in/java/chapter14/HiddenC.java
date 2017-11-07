package thinking.in.java.chapter14;
//: typeinfo/packageaccess/HiddenC0.java
import static net.mindview.util.Print.*;

class C0 implements A {
  public void f() { print("public C0.f()"); }
  public void g() { print("public C0.g()"); }
  void u() { print("package C0.u()"); }
  protected void v() { print("protected C0.v()"); }
  private void w() { print("private C0.w()"); }
}

public class HiddenC {
  public static A makeA() { return new C0(); }
} ///:~
