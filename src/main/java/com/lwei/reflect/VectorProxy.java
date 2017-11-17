package com.lwei.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

public class VectorProxy implements InvocationHandler {

	private Object proxyObj;
	
	public VectorProxy(Object obj) {
		this.proxyObj = obj;
	}
	
	public static Object factory(Object obj) {
		return Proxy.newProxyInstance(obj.getClass().getClassLoader()
				,obj.getClass().getInterfaces()
				,new VectorProxy(obj));
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("Before calling" + method);

		if(args != null) {
			for(int i = 0; i < args.length; i++) {
				System.out.println(args[i] + " ");
			}
		}
		Object object = method.invoke(proxyObj, args);
		
		System.out.println("After calling" + method);
		return object;
	}
	
	public static void main(String[] args) {
		List<String> v = (List<String>)factory(new Vector<String>());
		
		v.add("New");
		v.add("York");
		System.out.println(v);
		
		v.remove(0);
		System.out.println(v);
	}

}
