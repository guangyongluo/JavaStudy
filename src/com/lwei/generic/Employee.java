package com.lwei.generic;

/**
 * 
 * @author lwei 
 * 
 * 继承：
 *  1.可以不使用泛型参数，其实际类型就是Object 
 *  2.也可以使用泛型参数，可以指定具体参数类型如：Employee extends person<String> 
 *  3.继承类也可以使用泛型参数，不指定具体类如：Employee<T> extends person<String>
 *  4.子类使用泛型，父类指定具体类型参数：Employee<T> extends person<String>
 */
public class Employee<T> extends Person<T> {
    public static void main(String[] args) {
		Employee emp = new Employee<String>();
	}
}
