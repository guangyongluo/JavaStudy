package thinking.in.java.chapter12;
// exceptions/Storm2yInning229.java
// TIJ4 Chapter Exceptions, Exercise 29, page 500
/* Modify all the exception types in Storm2yInning2.java so that they extend
* RuntimeException, and show that no exception specifications or try blocks
* are necessary. Remove the '//!' comments and show how the methods can be 
* compiled without specifications.
*/

class BaseballException1 extends RuntimeException {}
class Foul1 extends RuntimeException {}
class Strike1 extends RuntimeException {}

abstract class Inning2 {
	public Inning2() {}
	public void event() {}
	public abstract void atBat();
	public void walk() {} 
}

class Storm2Exception1 extends RuntimeException {}
class RainedOut2 extends RuntimeException {}
class PopFoul1 extends RuntimeException {}

interface Storm2 {
	public void event();
	public void rainHard();
}

public class StormyInning29 extends Inning2 implements Storm2 {
	public StormyInning29() {}
	public StormyInning29(String s) {}
	public void walk() {}
	public void event() {}
	public void rainHard() {}
	public void atBat() {}
	public static void main(String[] args) {
		StormyInning29 si = new StormyInning29();
		si.atBat();
		// What happens if you upcast?
		StormyInning29 i = new StormyInning29();
		i.atBat();		
	}
}