package thinking.in.java.chapter15;
// generics/Holders30.java
// TIJ4 Chapter Generics, Exercise 30, page 696
// Create a Holder for each of the primitive wrapper types, and show that
// autoboxing and autounboxing works for the set() and get() methods of 
// each instance.

public class Holders30 {
	public static void main(String[] args) {
		Holder<Character> charHolder = new Holder<Character>();
		Holder<Byte> byteHolder = new Holder<Byte>();
		Holder<Short> shortHolder = new Holder<Short>();
		Holder<Integer> intHolder = new Holder<Integer>();
		Holder<Long> longHolder = new Holder<Long>();
		Holder<Float> floatHolder = new Holder<Float>();
		Holder<Double> doubleHolder = new Holder<Double>();
		// Autoboxing and autounboxing work:
		charHolder.set('a');
		System.out.print(charHolder.get() + ", ");
		System.out.println(charHolder.get().getClass());
		char c = charHolder.get();
		System.out.println("char c = charHolder.get() = " + c);
		byte b = 1;
		byteHolder.set(b);
		System.out.print(byteHolder.get() + ", ");
		System.out.println(byteHolder.get().getClass());
		byte bb = byteHolder.get();
		System.out.println("byte bb = byteHolder.get() = " + bb);			
		short s = 1;
		shortHolder.set(s);
		System.out.print(shortHolder.get() + ", ");
		System.out.println(shortHolder.get().getClass());
		short ss = shortHolder.get();
		System.out.println("short ss = shortHolder.get() = " + ss);
		intHolder.set(1);
		System.out.print(intHolder.get() + ". ");
		System.out.println(intHolder.get().getClass());
		int i = intHolder.get();
		System.out.println("int i = intHolder.get() = " + i);
		long l = 2;
		longHolder.set(l);
		System.out.print(longHolder.get() + ", ");
		System.out.println(longHolder.get().getClass());
		long ll = longHolder.get();
		System.out.println("long ll = longHolder.get() = " + ll);
		float f = 1f;
		floatHolder.set(f);
		System.out.print(floatHolder.get() + ", ");
		System.out.println(floatHolder.get().getClass());
		float ff = floatHolder.get();
		System.out.println("float ff = floatHolder.get() = " + ff);
		double d = 1.1;
		doubleHolder.set(d);
		System.out.print(doubleHolder.get() + ", ");
		System.out.println(doubleHolder.get().getClass());
		double dd = doubleHolder.get();
		System.out.println("double dd = doubleHolder.get() = " + dd);		
	}		
		
}