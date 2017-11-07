package thinking.in.java.chapter12;
// exceptions/LostMessage18.java
// TIJ4 Chapter Exceptions, Exercise 18, page 479
// Add a second level of exception loss to LostMessage.java so that the
// HoHumException1 is itself replaced by a third exception.

class VeryImportantException1 extends Exception {
	public String toString() {
		return "A very important exception!";
	}
}

class HoHumException1 extends Exception {
	public String toString() {
		return "A trivial exception";
	}
}

class MeaninglessException1 extends Exception {
	public String toString() {
		return "A meaningless exception";
	}
}	

public class LostMessage18 {
	void f() throws VeryImportantException1 {
		throw new VeryImportantException1();
	}
	void dispose() throws HoHumException1 {
		throw new HoHumException1();
	}
	void eliminate() throws MeaninglessException1 {
		throw new MeaninglessException1();
	}
	public static void main(String[] args) {
		try {
			LostMessage18 lm = new LostMessage18();
			try {
				try {
					lm.f();
					lm.dispose();
				} finally {
					lm.eliminate();
				}
			} catch(Exception e) {
				System.out.println(e);
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}