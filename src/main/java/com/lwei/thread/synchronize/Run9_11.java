package com.lwei.thread.synchronize;

import com.lwei.thread.synchronize.PublicClass2.PrivateClass;

public class Run9_11 {

	public static void main(String[] args) {

		PublicClass2 publicClass = new PublicClass2();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");

		System.out.println(publicClass.getUsername() + " " + publicClass.getPassword());

		PrivateClass privateClass = new PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");

		System.out.println(privateClass.getAge() + " " + privateClass.getAddress());

	}

}
