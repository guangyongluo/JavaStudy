package com.lwei.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

class Type1{
	public Map<String, Object> cache;
}

public class GenericTypeDemo {

	public static void main(String[] args) throws Exception {
		Class clz = Type1.class;
		Field f = clz.getField("cache");
		Class type = f.getType();
		System.out.println(type);
		
		System.out.println("===================");
		
		Type t = f.getGenericType();
		System.out.println(t);
		ParameterizedType pType = (ParameterizedType) t;
		Type[] ts = pType.getActualTypeArguments();
		System.out.println(ts[0]);
		System.out.println(ts[1]);
	}
	
}
