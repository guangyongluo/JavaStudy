package thinking.in.java.chapter08;
// polymorphism/music8/Music8.java
// TIJ4 Chapter Polymorphism, Exercise 8, page 289
/* Modify Music3.java so that it randomly creates Instrument objects the way
* Shapes.java does.
*/
/* Solution includes, in same package:
 * 
*/ 
import java.util.*;
class RandomInstrumentGenerator {
	private Random rand = new Random();
	public Instrument next() {
		switch(rand.nextInt(7)) {
			default:
			case 0: return new Wind2();
			case 1: return new Percussion2();
			case 2: return new Stringed2();
			case 3: return new Keyboard2();
			case 4: return new Brass2();
			case 5: return new WoodWind2();
			case 6: return new Piano2();
		}
	}
}

class Wind2 extends Instrument {
	void play(Note n) { System.out.print("Wind2.play() " + n); }
	public String toString() { return "Wind2"; }
	void adjust() { System.out.print("Adjusting Wind2"); }
}

class Percussion2 extends Instrument {
	void play(Note n) { System.out.print("Percussion2.play() " + n); }
	public String toString() { return "Percussion2"; }
	void adjust() { System.out.print("Adjusting Percussion2"); } 
}

class Stringed2 extends Instrument {
	void play(Note n) { System.out.print("Stringed2.play() " + n); }
	public String toString() { return "Stringed2"; }
	void adjust() { System.out.print("Adjusting Stringed2"); } 
}

class Keyboard2 extends Instrument {
	void play(Note n) { System.out.print("Keyboard2.play() " + n); }
	public String toString() { return "Keyboard2"; }
	void adjust() { System.out.print("Adjusting Keyboard2"); } 
}

class Brass2 extends Wind2 {
	void play(Note n) { System.out.print("Brass2.play() " + n); }
	public String toString() { return "Brass2"; }
	void adjust() { System.out.print("Adjusting Brass2"); }
}

class WoodWind2 extends Wind2 {
	void play(Note n) { System.out.print("WoodWind2.play() " + n); }
	public String toString() { return "WoodWind2"; }
}

class Piano2 extends Keyboard2 {
	void play(Note n) { System.out.print("Piano2.play() " + n); }
	public String toString() { return "Piano2"; }
}

public class Music8 {
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
	private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();	
	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument[] orchestra = new Instrument[20];
		// fill up orchestra array wth instruments:
		for(int i = 0; i < orchestra.length; i++)
			orchestra[i] = gen.next();
		tuneAll(orchestra);
		for(Instrument i : orchestra)
			System.out.println(i);
	}
}