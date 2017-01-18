package thinking.in.java.chapter05;
// initialization/TerminationConditionEx.java
// TIJ4 Chapter Initialization, Exercise 10, page 177
/* Create a class with a finalize() method that prints a message. In main(),
* create an object of your class. Explain the behavior of your program.
*/  

class WebBank2 {
	boolean loggedIn = false;
	WebBank2(boolean logStatus) {
		loggedIn = logStatus;
	}
	void logIn() {
		loggedIn = true;
	}
	void logOut() {
		loggedIn = false;
	}
	protected void finalize() {
		if(loggedIn)
			System.out.println("Error: still logged in");
		// Normally, you'll also do this:
		// super.finalize(); // Call the base-class version
	}
}

public class TerminationConditionEx {
	public static void main(String[] args) {
		WebBank2 bank1 = new WebBank2(true);
		WebBank2 bank2 = new WebBank2(true);
		// Proper cleanup: log out of bank1 before going home
		bank1.logOut();
		// Drop the reference, forget to cleanup:
		new WebBank2(true);
		// Force garbage collection and finalization:
		System.gc();
	}	
}