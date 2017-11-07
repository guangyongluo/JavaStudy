package com.lwei.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyRefection {

	public static void main(String[] args) throws Exception {
		Class<MyTest> clazz = MyTest.class;
		Method method = clazz.getDeclaredMethod("output");

		if (method.isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
			String hello = myAnnotation.hello();
			String world = myAnnotation.world();

			System.out.println("hello() = " + hello);
			System.out.println("world() = " + world);
		}

		Annotation[] annotations = method.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation.annotationType().getName());
		}
	}

}
