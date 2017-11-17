package com.lwei.dynamic.proxy;

public class Client2 {

	public static void main(String[] args) {
        Subject2 sub = new ProxySubject2();
        
        sub.request();
	}

}
