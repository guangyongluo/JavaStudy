package thinking.in.java.chapter15;
// generics/ClassTypeCreator22.java
// TIJ4 Chapter Generics, Exercise 22, page 667
/* Use a type tag along with reflection to create a method that uses the 
* argument version of newInstance() to create an object of a class with
* a constructor that has arguments.
*/
import java.util.*;
import java.lang.reflect.*;

class Building1 {}
class House1 extends Building1 {
	private String location;
	private Integer area;
	public House1() { location = null; }
	public House1(Integer area) { this.area = area; }
	public House1(String location) {
		this.location = location;
	}
	public House1(String location, Integer area) {
		this.location = location;
		this.area = area;
	}
	public String toString() {
		return "House1" + ((location == null) ? "" :  " in " + location) +
			((area != null) ? (", "+ area + " sqft") : "");
	}
}

public class ClassTypeCreator22<T> {
	Class<?> kind;
	public ClassTypeCreator22(Class<?> kind) {
		this.kind = kind;
	}
	public Object createNew(String typename) 
		throws 	IllegalAccessException, 
			InstantiationException, 
			ClassNotFoundException {
		return Class.forName(typename).newInstance();
	}	
	/** To create instance of typename with constructors taking arguments args: */
	public Object createNew(String typename, Object... args) 
		throws 	IllegalAccessException, 
			InstantiationException, 
			ClassNotFoundException,
			NoSuchMethodException,
			InvocationTargetException {
		switch(args.length) {
		case 1 : return Class.forName(typename).getConstructor(args[0].getClass()).newInstance(args[0]);
		case 2 : return Class.forName(typename).getConstructor(args[0].getClass(), args[1].getClass()).
			newInstance(args[0], args[1]);
		}
		return null;
	}
	public static void main(String[] args) {
		ClassTypeCreator22<Building1> ctcb = new ClassTypeCreator22<Building1>(Building1.class);
		ClassTypeCreator22<House1> ctch = new ClassTypeCreator22<House1>(House1.class);
		try {
			Building1 b = (Building1)ctcb.createNew("thinking.in.java.chapter15.Building1");
			// To show we can access and print House1 constructors:
			System.out.println("House1 constructors:");
			Constructor[] ctors = House1.class.getConstructors();
			for(Constructor ctor : ctors) System.out.println(ctor);
			// create 3 new House1 objects:
			House1 h = (House1)ctch.createNew("thinking.in.java.chapter15.House1", "Hawaii");
			House1 h2 = (House1)ctch.createNew("thinking.in.java.chapter15.House1", 3000);
			House1 h3 = (House1)ctch.createNew("thinking.in.java.chapter15.House1", "Manila", 5000);
			System.out.println("Constructed House1 objects:");
			System.out.println(h);
			System.out.println(h2);
			System.out.println(h3);
		} catch(IllegalAccessException e) {
			System.out.println("IllegalAccessException in main");
		} catch(InstantiationException e) {
			System.out.println("InstantiationException in main");
		} catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException in main");
		} catch(NoSuchMethodException e) {
			System.out.println("NoSuchMethodException in main");
		} catch(InvocationTargetException e) {
			System.out.println("InvocationTargetException in main");
		}		
	}
}