package org.tnsindia.abstraction;

class C{
	//Default Variable
	String VehicleType;
	
}
public class DemoOnDefault {

	public static void main(String[] args) {
		C c=new C();
		/*
		 * If any data members is default then it can access only inside the same package	,
		 * it cannot be access outside the another package
		 */
		c.VehicleType="Train";
		System.out.println("Vehicle Type is : "+c.VehicleType);

	}

}