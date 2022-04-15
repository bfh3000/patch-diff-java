package com.user.test;

class Car extends Vehicle {
	public Car() {
		
	}
	
	public Car(String val) {
		super.name = val;
	}

	@Override
	public String getName(String val) {
		return "Car name :" + val;
	}
}