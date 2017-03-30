package thinking.in.java.chapter15;
// generics/FactoryConstraint23.java

// TIJ4 Chapter Generics, Exercise 23, page 667
// Modify FactoryConstraint.java so that create() takes an argument.

interface FactoryI1<T> {
	T create(Integer i);
}

class Foo3<T> {
	private T x;

	public void get() {
		System.out.println(x);
	}

	public <F extends FactoryI1<T>> Foo3(F factory, Integer i) {
		x = factory.create(i);
	}
}

class IntegerFactory1 implements FactoryI1<Integer> {
	public Integer create(Integer i) {
		return new Integer(i);
	}
}

class Widget1 {
	int i;

	public static class Factory implements FactoryI1<Widget1> {
		public Widget1 create(Integer i) {
			Widget1 w = new Widget1();
			w.i = i;
			return w;
		}
	}

	public String toString() {
		return "Widget1 " + i;
	}
}

public class FactoryConstraint23 {
	public static void main(String[] args) {
		Foo3 f1 = new Foo3<Integer>(new IntegerFactory1(), 1);
		Foo3 f2 = new Foo3<Widget1>(new Widget1.Factory(), 2);
		f1.get();
		f2.get();
	}
}