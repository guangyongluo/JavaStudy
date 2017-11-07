package com.lwei.annotation;

public @interface AnnotationTest {

	enum EnumTest {
		Hello, world, Welcome
	};

	String[] value1() default "lwei";

	EnumTest value2() default EnumTest.Hello;

}
