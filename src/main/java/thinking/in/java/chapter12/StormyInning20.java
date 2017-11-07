package thinking.in.java.chapter12;
// exceptions/Storm1yInning120.java
// TIJ4 Chapter Exceptions, Exercise 20, page 
/* MOdify Storm1yInning1.java by adding an UmpireArgument exception type
* and methods that throw this exception. Test the modified hierarchy. 
*/

// Overridden methods may throw only the exceptions
// specified in their base-class versions, or exceptions
// derived from the base-class exceptions.

class UmpireArgument extends BaseballException {}
class ThrownFromGame extends UmpireArgument {}

abstract class Inning1 {
	public Inning1() throws BaseballException {}
	public void event() throws BaseballException {
		// Doesn't actually have to throw anything
	}
	public abstract void atBat() throws Strike, Foul, UmpireArgument;
	public void questionableCall() throws UmpireArgument {}
	public void walk() {} // Throws no checked exceptions
}

class Storm1Exception extends Exception {}
class RainedOut1 extends Storm1Exception {}


interface Storm1 {
	public void event() throws RainedOut1;
	public void rainHard() throws RainedOut1;
}

public class StormyInning20 extends Inning1 implements Storm1 {
	// OK to add new exceptions for constructors, but you
	// must deal with the base constructor exceptions:
	public StormyInning20()
		throws UmpireArgument, RainedOut1, BaseballException {}
	public StormyInning20(String s)
		throws Foul, BaseballException {}
	// Regular methods must comform to base class:
	//! void walk() throws PopFoul {} // Compile error
	// Interface CANNOT add exceptions to existing
	// methods from the base class:
	//! public void event() throws RainedOut1 {}
	// If method doesn't already exist in the
	// base class, the exception is OK:
	public void rainHard() throws RainedOut1 {}
	// You can choose to not throw any exceptions,
	// even if the base class version does:
	public void event() {}
	// Overridden methods can throw inherited exceptions:
	public void atBat() throws PopFoul, ThrownFromGame { 
		throw new ThrownFromGame();	
	}	
	public void questionableCall() throws UmpireArgument {
		throw new UmpireArgument();
	}
	public static void main(String[] args) {
		try {
			StormyInning20 si = new StormyInning20();
			si.atBat();
			si.questionableCall();
		} catch(PopFoul e) {
			System.out.println("Pop foul");
		} catch(UmpireArgument e) {
			System.out.println("Umpire argument (Storm1yInning120)");
		// } catch(ThrownFromGame e) {
		//	System.out.println("Thrown from game");			
		} catch(RainedOut1 e) {
			System.out.println("Rained out");
		} catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		} 
		// Strike not thrown in derived version.
		try {
			// What happens if you upcast?
			StormyInning20 i = new StormyInning20();
			i.atBat();
			// You must catch the exceptions from
			// the base-class version of the method:
		} catch(Strike e) {
			System.out.println("Strike");
		} catch(Foul e) {
			System.out.println("Foul");
		} catch(ThrownFromGame e) {
			System.out.println("Thrown from game (Inning1)");	
		} catch(RainedOut1 e) {
			System.out.println("Rained out");
		} catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
	}
}