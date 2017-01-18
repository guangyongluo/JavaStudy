package thinking.in.java.chapter08;
// polymorphism/music6/Music6.java
// TIJ4 Chapter Polymorphism, Exercise 6, page 289
/* Change Music3.java so that what() beccomes the root Object method toString().
* Try System.out.printing the Instrument objects using System.out.System.out.println() without any 
* casting.
*/

class Instrument {
	void play(Note n) { System.out.print("Instrument.play() " + n); }
	public String toString() { return "Instrument"; }
	void adjust() { System.out.print("Adjusting Instrument"); }
}

class Wind extends Instrument {
	void play(Note n) { System.out.print("Wind.play() " + n); }
	public String toString() { return "Wind"; }
	void adjust() { System.out.print("Adjusting Wind"); }
}

class Percussion extends Instrument {
	void play(Note n) { System.out.print("Percussion.play() " + n); }
	public String toString() { return "Percussion"; }
	void adjust() { System.out.print("Adjusting Percussion"); } 
}

class Stringed extends Instrument {
	void play(Note n) { System.out.print("Stringed.play() " + n); }
	public String toString() { return "Stringed"; }
	void adjust() { System.out.print("Adjusting Stringed"); } 
}

class Brass extends Wind {
	void play(Note n) { System.out.print("Brass.play() " + n); }
	public String toString() { return "Brass"; }
	void adjust() { System.out.print("Adjusting Brass"); }
}

class Woodwind extends Wind {
	void play(Note n) { System.out.print("Woodwind.play() " + n); }
	public String toString() { return "Woodwind"; }
}

public class Music6 {
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
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind()
		};
		tuneAll(orchestra);
		for(Instrument i : orchestra)
			System.out.println(i);
	}
}