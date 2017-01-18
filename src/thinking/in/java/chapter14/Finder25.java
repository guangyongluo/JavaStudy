package thinking.in.java.chapter14;

import java.lang.reflect.Method;

// typeinfo/Finder25.java
// TIJ4 Chapter Typeinfo, Exercise 25, page 613
/* Create a class containing private, protected and package-access methods. 
* Write code to access these methods from outside of the class's package.
*/

/* Solution includes, in another package:
* package typeinfo.secret;
*/
interface A2 {
	void e();
}
// and:

class Secret implements A2 {
	public void e() { System.out.println("public Secret.e()"); } 
	void f() { System.out.println("package Secret.f()"); }
	protected void g() { System.out.println("protected Secret.g()"); }
	private void h() { System.out.println("private Secret.h()"); }
}

class SecretMaker {
	public static A2 makeSecret() { return new Secret();  }
}

public class Finder25 {
	public static void main(String[] args) throws Exception {
		A2 a = SecretMaker.makeSecret();
		System.out.println("a is of class type: " + a.getClass().getName());
		for(Method m : a.getClass().getDeclaredMethods()) {
			m.setAccessible(true);
			m.invoke(a);
		}
	}
}