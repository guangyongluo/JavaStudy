package thinking.in.java.chapter14;
// typeinfo/ClassInfo.java
// TIJ4 Chapter TypeInfo, Exercise 20, page 593
/* Look up the interface for java.lang.Class in the JDK decumentation from 
* http://java.sun.com. Write a program that takes the name of a class as a
* command line argument, then uses the Class methods to dump all the 
* information available for that class. Test your prgram with a standard
* library class and a class you create.
*/
import java.lang.reflect.*;
import java.lang.annotation.*;

public class ClassInfo {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Usage: name of class");
			System.exit(0);
		}
		Class<?> c = null;
		try {
			c = Class.forName(args[0]);
		} catch(ClassNotFoundException e) {
			System.out.println("No such class: " + e);
		}
		System.out.println("c: " + c);
		System.out.println("c.getAnnotations(): ");
		if(c.getAnnotations().length == 0) System.out.println("none");
		for(Annotation a : c.getAnnotations())
			System.out.println(a);
		System.out.println("c.getCanonicalName(): " + c.getCanonicalName());
		System.out.println("c.getClasses(): ");
		if(c.getClasses().length == 0) System.out.println("none");
		for(Class cl : c.getClasses())
			System.out.println(cl);
		System.out.println("c.getClassLoader(): " + c.getClassLoader());
		System.out.println("c.getConstructors(): ");
		if(c.getConstructors().length == 0) System.out.println("none");
		for(Constructor ctor : c.getConstructors())
			System.out.println(ctor);
		System.out.println("c.getDeclaredAnnotations(): ");
		if(c.getDeclaredAnnotations().length == 0) System.out.println("none");
		for(Annotation a : c.getDeclaredAnnotations())
			System.out.println(a);
		System.out.println("c.getDeclaredClasses(): ");
		if(c.getDeclaredClasses().length == 0) System.out.println("none");
		for(Class cl : c.getDeclaredClasses())
			System.out.println(cl);
		System.out.println("c.getDeclaredConstructors(): ");
		if(c.getDeclaredConstructors().length == 0) System.out.println("none");
		for(Constructor ctor : c.getDeclaredConstructors())
			System.out.println(ctor);
		System.out.println("c.getDeclaredFields(): ");
		if(c.getDeclaredFields().length == 0) System.out.println("none");
		for(Field f : c.getDeclaredFields())
			System.out.println(f);
		System.out.println("c.getDeclaredMethods(): ");
		if(c.getDeclaredMethods().length == 0) System.out.println("none");
		for(Method m : c.getDeclaredMethods())
			System.out.println(m);
		System.out.println("c.getDeclaringClass(): " + c.getDeclaringClass());
		System.out.println("c.getEnclosingConstructor(): " + c.getEnclosingConstructor());
		System.out.println("c.getEnclosingMethod(): " + c.getEnclosingMethod());
		System.out.println("c.getEnumConstants(): " + c.getEnumConstants());
		System.out.println("c.getDeclaredFields(): ");
		if(c.getFields().length == 0) System.out.println("none");
		for(Field f : c.getFields())
			System.out.println(f);
		System.out.println("c.getGenericInterfaces(): ");
		if(c.getGenericInterfaces().length == 0) System.out.println("none");
		for(Type t : c.getGenericInterfaces())
			System.out.println(t);
		System.out.println("c.getGenericSuperclass(): " + c.getGenericSuperclass());
		System.out.println("c.getInterfaces(): ");
		if(c.getInterfaces().length == 0) System.out.println("none");
		for(Class i : c.getInterfaces())
			System.out.println(i);
		System.out.println("c.getMethods(): ");
		if(c.getMethods().length == 0) System.out.println("none");
		for(Method m : c.getMethods())
			System.out.println(m);
		System.out.println("c.getModifiers(): " + c.getModifiers());
		System.out.println("c.getName(): " + c.getName());
		System.out.println("c.getPackage(): " + c.getPackage());
		System.out.println("c.getProtectionDomain(): " + c.getProtectionDomain());
		System.out.print("c.getSigners(): ");
		if(c.getSigners() == null)
			System.out.println(c.getSigners());
		if(c.getSigners() != null) {
			System.out.println();
			if(c.getSigners().length == 0) System.out.println("none");
			if(c.getSigners().length > 0) {
				for(Object s : c.getSigners()) 
					System.out.println(s);
			}
		}
		System.out.println("c.getSimpleName(): " + c.getSimpleName());
		System.out.println("c.getSuperclass(): " + c.getSuperclass());
		System.out.println("c.getTypeParameters(): " + c.getTypeParameters());
		System.out.println("c.isAnnotation(): " + c.isAnnotation());
		System.out.println("c.isAnnotationPresent(Documented.class): " + c.isAnnotationPresent(Documented.class));
		System.out.println("c.isAnonymousClass(): " + c.isAnonymousClass());
		System.out.println("c.isArray(): " + c.isArray());
		System.out.println("c.isAssignableFrom(ClassInfo.class): " + c.isAssignableFrom(ClassInfo.class));
		System.out.println("c.isAssignableFrom(Object.class): " + c.isAssignableFrom(Object.class));
		System.out.println("c.isEnum(): " + c.isEnum());
		System.out.println("c.isInstance(Object.class): " + c.isInstance(Object.class));
		System.out.println("c.isInterface(): " + c.isInterface());
		System.out.println("c.isLocalClass(): " + c.isLocalClass());
		System.out.println("c.isMemberClass(): " + c.isMemberClass());
		System.out.println("c.isPrimitive(): " + c.isPrimitive());
		System.out.println("c.isSynthetic(): " + c.isSynthetic());		
	}
}