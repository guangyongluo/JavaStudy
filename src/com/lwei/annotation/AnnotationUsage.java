package com.lwei.annotation;

import com.lwei.annotation.AnnotationTest.EnumTest;

public class AnnotationUsage {

	@AnnotationTest(value1 = "Hello World", value2 = EnumTest.world)
	public void method() {
		System.out.println("Usage of Annotation");
	}

	public static void main(String[] args) {
		AnnotationUsage au = new AnnotationUsage();
		au.method();
	}
}
