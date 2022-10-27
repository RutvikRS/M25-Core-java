package org.tnsindia.enumdemo;

public enum Meal {
	BREAKFAST(4),LUNCH(7),DINNER(10);
	private int value;
	//getters and setter method to access private variables into another class
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	//Constructor 
	private Meal(int value) {
		this.value = value;
	}
	
	
}
