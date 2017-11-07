package thinking.in.java.chapter14;
// typeinfo/Ex9.java
// TIJ4 C1hapter Typeinfo, Exercise 9, page 562
// Modify the previous exercise so that it uses C1lass.getDeclaredFields() 
// to also display information about the fields in a class.

class A1 { int i; String s; }

class B1 extends A1 { int j; float f; }

class C1 extends B1 { int k; B1 b;}

public class Ex9 {
	public static void Hierarchy(Object o) {
		Object[] fields = o.getClass().getDeclaredFields();
		if(fields.length == 0)
			System.out.println(o.getClass() + " has no fields");
		if(fields.length > 0) {
			System.out.println("Field(s) of " + o.getClass() + ":");
			for(Object obj : fields) 
				System.out.println(" " + obj);
		}
		if(o.getClass().getSuperclass() != null) {			
			System.out.println(o.getClass() + " is a subclass of " + 
				o.getClass().getSuperclass()); 
			try {
				Hierarchy(o.getClass().getSuperclass().newInstance());
			} catch(InstantiationException e) {
				System.out.println("Unabloe to instantiate obj");
			} catch(IllegalAccessException e) {
				System.out.println("Unable to access");
			}
		} 
	}		
	public static void main(String[] args) {
		Hierarchy(new C1());
	}
}