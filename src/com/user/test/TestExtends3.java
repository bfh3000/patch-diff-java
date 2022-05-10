package com.user.test;

public abstract class TestExtends3 {
	String name;

	abstract public String getName(String val);

	public String getName() {
		return "Vehicle name :" + name;
	}
}