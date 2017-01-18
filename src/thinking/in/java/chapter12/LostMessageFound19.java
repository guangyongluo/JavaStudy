package thinking.in.java.chapter12;
// exceptions/LostMessageFound19.java
// TIJ4 Chapter Exceptions, Exercise 19, page 479
// Repair the problem in LostMessage.java by guarding the call in the
// finally clause.

class VeryImportantException2 extends Exception {
	public String toString() {
		return "A very important exception!";
	}
}

class HoHumException2 extends Exception {
	public String toString() {
		return "A trivial exception";
	}
}

public class LostMessageFound19 {
	void f() throws VeryImportantException2 {
		throw new VeryImportantException2();
	}
	void dispose() throws HoHumException2 {
		throw new HoHumException2();
	}
	public static void main(String[] args) {
		try {
			LostMessageFound19 lmf = new LostMessageFound19();
			try {
				lmf.f();
			} catch(Exception e) {
				System.out.println(e);
			} finally {
				lmf.dispose();
			}

		} catch(Exception e) {
			System.out.println(e);
		}
	}
}