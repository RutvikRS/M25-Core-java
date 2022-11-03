package org.tnsindia.Junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FirstJUNIT5Test {

	@Test
	//it will perform on testing on the method
	void test() {
		System.out.println("Hello everyone");
	}
	
	@Test
	@Disabled
	void display() {
		fail("hi");
	}

}
