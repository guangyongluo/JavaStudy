package com.lwei.thread.synchronize;

import com.lwei.thread.synchronize.PublicClass.PrivateClass;

public class Run9_10 {

	public static void main(String[] args) {

		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");

		System.out.println(publicClass.getUsername() + " " + publicClass.getPassword());

		PrivateClass privateClass = publicClass.new PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");

		System.out.println(privateClass.getAge() + " " + privateClass.getAddress());

	}

}
