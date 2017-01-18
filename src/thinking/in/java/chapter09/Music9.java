package thinking.in.java.chapter09;
// interfaces/music9/Music9.java
// TIJ4 Chapter Interfaces, Exercise 9, page 320
/* Refactor Music5.java by moving the common methods in Wind1, Percussion1 and
* Stringed1 into an abstract class.
*/

abstract class Instrument1 {
	private int i; 
	public abstract void play(Note n);
	public String toString() { return "Instrument1"; } 
	public abstract void adjust(); 
}

class Wind1 extends Instrument1 {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Wind1"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}

class Percussion1 extends Instrument1 {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Percussion1"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}

class Stringed1 extends Instrument1 {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Stringed1"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}

class Brass1 extends Wind1 {
	public String toString() { return "Brass1"; }
}

class WoodWind1 extends Wind1 {
	public String toString() { return "Woodwing"; }
}

public class Music9 {
	// Doesn't care about type, so new types
	// added to the system will work right:
	static void tune(Instrument1 i) {
		//...
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument1[] e) {
		for(Instrument1 i : e)
			tune(i);
	}
	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument1[] orchestra = {
			new Wind1(),
			new Percussion1(),
			new Stringed1(),
			new Brass1(),
			new WoodWind1()
		};
		tuneAll(orchestra);
	}
}