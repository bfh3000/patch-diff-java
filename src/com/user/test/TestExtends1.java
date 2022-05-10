package com.user.test;

public class TestExtends1 {

	public static void main(String[] args) {
		TestExtends3 obj = new TestExtends2("d");
		TestExtends2 obj2 = new TestExtends2("gg");
		
		System.out.println(obj.getName());
		System.out.println(obj2.getName());
		System.out.println(obj2.getName("dddfasdfaf"));
		
	}
	
	class dehicle_sub2 {
		String a = "";
	}
}

class dehicle_sub {
	String a = "";
}
