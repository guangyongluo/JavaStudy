package thinking.in.java.chapter08;
// polymorphism/PolyConstructors15.java
// TIJ4 Chapter Polymorphism, Exercise 15, page 303
// Add a RectangularGlyph to PolyConstructors.java and demonstrate the problem
// described in this section.

class Glyph {
	void draw() { System.out.print("Glyph.draw()"); }
	Glyph() {
		System.out.print("Glyph() before draw()");
		draw();
		System.out.print("Glyph() after draw()"); 
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	RoundGlyph(int r) {
		radius = r;
		System.out.print("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	void draw() {
		System.out.print("RoundGlyph.draw(), radius = " + radius);
	}
}

class RectangularGlyph extends Glyph {
	private int length = 2;
	private int width = 4;
	RectangularGlyph(int l, int w) {
		length = l;
		width = w;
		System.out.print("RectangularGlyph.RectangularGlyph(), length = " 
			+ length + ", width = " + width);
	}
	void draw() {
		System.out.print("RectangularGlyph.draw(), length = " + length 
			+ ", width = " + width);
	}
}


public class PolyConstructors15 {
	public static void main(String[] args) {
		new RoundGlyph(5);
		new RectangularGlyph(3, 6);
	}
}