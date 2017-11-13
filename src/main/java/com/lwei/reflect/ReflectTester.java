package com.lwei.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTester {

	public Object copy(Object object) throws Exception {

		Class<?> classType = object.getClass();
		System.out.println("Class:" + classType.getName());

		Object objectCopy = classType.getConstructor(new Class[] {}).newInstance(new Object[] {});

		Field fields[] = classType.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			String fieldName = field.getName();
			String firstLetter = fieldName.substring(0, 1).toUpperCase();

			String getMethodName = "get" + firstLetter + fieldName.substring(1);

			String setMethodName = "set" + firstLetter + fieldName.substring(1);

			Method getMethod = classType.getMethod(getMethodName, new Class[] {});
			Method setMethod = classType.getMethod(setMethodName, new Class[] { field.getType() });

			Object value = getMethod.invoke(object, new Object[] {});

			System.out.println(fieldName + ":" + value);

			setMethod.invoke(objectCopy, new Object[] { value });
		}

		return objectCopy;

	}

	public static void main(String args[]) throws Exception {
		Customer customer = new Customer("Tom", 21);
		customer.setId(new Long(1));

		Customer customerCopy = (Customer) new ReflectTester().copy(customer);
		System.out.println("Copy Information : " + customerCopy.getId() + " " + customerCopy.getName() + " "
				+ customerCopy.getAge());

	}
}

class Customer {
	private long id;
	private String name;
	private int age;

	public Customer() {
	}

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}