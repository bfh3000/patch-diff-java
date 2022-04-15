package com.user.test;

abstract class Vehicle {
	String name;

	abstract public String getName(String val);

	public String getName() {
		return "Vehicle name :" + name;
	}
}