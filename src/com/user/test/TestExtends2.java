package com.user.test;

public class TestExtends2 extends TestExtends3 {
	public TestExtends2() {
		
	}
	
	public TestExtends2(String val) {
		super.name = val;
	}

	@Override
	public String getName(String val) {
		return "Car name :" + val;
	}
	
	class test234 {
		String a = "";
	}
}

class externalClass2 {
	String a = "";
}