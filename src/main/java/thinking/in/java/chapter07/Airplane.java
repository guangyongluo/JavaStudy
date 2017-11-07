package thinking.in.java.chapter07;
// reusing/Airplane.java
// TIJ4, Chapter Reusing, Exercise 1, page 241 
/* Create a simple class. Inside a second class, define a reference to an object of
* the first class. Use lazy initialization to instantiate this object.
*/


class Engine {
	private String s;
	Engine() {
		System.out.println("Engine()");
		s = "Constructed";
	}
	public String toString() { return s; }
}

public class Airplane {
	private String fuselage, wings, tail;
	private Engine e;
	public Airplane() {
		System.out.println("Inside Airplane()");
		fuselage = "Body";
		wings = "Airfoils";
		tail = "Empennage";				
	}
	public String toString() { 
		if(e == null) // lazy (delayed) initialization:
			e = new Engine();
		return "fuselage = " + fuselage + ", " +
			"wings = " + wings + ", " +
			"tail = " + tail + ", " +
			"Engine = " + e;
	}
	public static void main(String[] args) {
		Airplane N1234 = new Airplane();
		System.out.println(N1234);
	}
}