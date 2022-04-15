package com.user.test;

public class TestExtends1 {

	public static void main(String[] args) {
		Vehicle obj = new Car("d");
		Car obj2 = new Car("gg");
		
		System.out.println(obj.getName());
		System.out.println(obj2.getName());
		System.out.println(obj2.getName("dddfasdfaf"));
		
	}
}
