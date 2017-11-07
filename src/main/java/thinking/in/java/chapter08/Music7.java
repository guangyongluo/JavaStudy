package thinking.in.java.chapter08;
// polymorphism/music7/Music7.java
// TIJ4 Chapter Polymorphism, Exercise 7, page 289
/* Add a new Instrument to Music3.java and verify that polymorphism works for
* your new type.
*/

class Wind1 extends Instrument {
	void play(Note n) { System.out.print("Wind1.play() " + n); }
	public String toString() { return "Wind1"; }
	void adjust() { System.out.print("Adjusting Wind1"); }
}

class Percussion1 extends Instrument {
	void play(Note n) { System.out.print("Percussion1.play() " + n); }
	public String toString() { return "Percussion1"; }
	void adjust() { System.out.print("Adjusting Percussion1"); } 
}

class Stringed1 extends Instrument {
	void play(Note n) { System.out.print("Stringed1.play() " + n); }
	public String toString() { return "Stringed1"; }
	void adjust() { System.out.print("Adjusting Stringed1"); } 
}

class Keyboard1 extends Instrument {
	void play(Note n) { System.out.print("Keyboard1.play() " + n); }
	public String toString() { return "Keyboard1"; }
	void adjust() { System.out.print("Adjusting Keyboard1"); } 
}

class Brass1 extends Wind1 {
	void play(Note n) { System.out.print("Brass1.play() " + n); }
	public String toString() { return "Brass1"; }
	void adjust() { System.out.print("Adjusting Brass1"); }
}

class WoodWind1 extends Wind1 {
	void play(Note n) { System.out.print("WoodWind1.play() " + n); }
	public String toString() { return "WoodWind1"; }
}

class Piano1 extends Keyboard1 {
	void play(Note n) { System.out.print("Piano1.play() " + n); }
	public String toString() { return "Piano1"; }
}

public class Music7 {
	// Doesn't care about type, so new types
	// added to the system still work right:
	public static void tune(Instrument i) {
		//...
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument[] orchestra = {
			new Wind1(),
			new Percussion1(),
			new Stringed1(),
			new Brass1(),
			new WoodWind1(),
			new Piano1()
		};
		tuneAll(orchestra);
		for(Instrument i : orchestra)
			System.out.println(i);
	}
}