package thinking.in.java.chapter15;
// generics/ClassTypeCapture24.java
// TIJ4 Chapter Generics, Exercise 24, page 667
// Modify Exercise 21 so that factory objects are held in the Map instead of Class<?>.
import java.util.*;

interface Factory<T> {
	T create();
}

class Building2 {}

class House2 extends Building2 {}

class Building2Factory implements Factory<Building2> {
	public Building2 create() {
		return new Building2();
	}
}

class House2Factory implements Factory<House2> {
	public House2 create() {
		return new House2();
	}
}

public class ClassTypeCapture24<T> {
	Class<?> kind;
	public ClassTypeCapture24(Class<?> kind) {
		this.kind = kind;
	}
	Map<String,Factory> map;	
	public ClassTypeCapture24(Class<?> kind, Map<String,Factory> map) {
		this.kind = kind;
		this.map = map;
	}
	public boolean f(Object arg) {
		return kind.isInstance(arg);
	}
	public void addType(String typename, Factory factory) {
		map.put(typename, factory);
	}
	public Object createNew(String typename) 
		throws IllegalAccessException, InstantiationException {
		if(map.containsKey(typename))
			return map.get(typename).create();			
		System.out.println(typename + " class not available");
		return null;
	}
	public static void main(String[] args) {
		ClassTypeCapture24<Building2> ctt1 = 
			new ClassTypeCapture24<Building2>(Building2.class);
		System.out.println(ctt1.f(new Building2()));
		System.out.println(ctt1.f(new House2()));
		ClassTypeCapture24<House2> ctt2 = 
			new ClassTypeCapture24<House2>(House2.class);
		System.out.println(ctt2.f(new Building2()));
		System.out.println(ctt2.f(new House2()));
		ClassTypeCapture24<Building2> ct = 
		new ClassTypeCapture24<Building2>(
			Building2.class, new HashMap<String,Factory>());
		ct.addType("House2", new House2Factory());
		ct.addType("Building2", new Building2Factory());
		System.out.println("ct.map = " + ct.map);
		try {
			Building2 b = (Building2)ct.createNew("Building2");
			House2 h = (House2)ct.createNew("House2");
			System.out.print("b.getClass().getName(): ");
			System.out.println(b.getClass().getName());
			System.out.print("h.getClass().getName(): ");
			System.out.println(h.getClass().getName());
			System.out.print("House2 h is instance House2: ");
			System.out.println(h instanceof House2);
			System.out.print("House2 h is instance of Building2: ");
			System.out.println(h instanceof Building2);
			System.out.print("Building2 b is instance of House2: ");
			System.out.println(b instanceof House2);
			ct.createNew("String");  // String class not available
		} catch(IllegalAccessException e) {
			System.out.println("IllegalAccessException in main");
		} catch(InstantiationException e) {
			System.out.println("InstantiationException in main");
		}		
	}
}