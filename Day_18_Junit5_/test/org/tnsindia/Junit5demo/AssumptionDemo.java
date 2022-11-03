package org.tnsindia.Junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
class AssumptionDemo {

	@Test
	void display() 
	{
		System.setProperty("Rutvik","Sakpal");
		//It will evaluate the given assumption and test will run as false
		Assumptions.assumeFalse("Sakpal".equals(System.getProperty("Rutvik", "Sakpal")));
		
	}
	@Test
	void display1() 
	{
		System.setProperty("Rutvik","Sakpal");
		//It will evaluate the given assumption and test will run as true
		Assumptions.assumeTrue("Sakpal".equals(System.getProperty("Rutvik", "Sakpal")));
		
	}
	
	
	

}
