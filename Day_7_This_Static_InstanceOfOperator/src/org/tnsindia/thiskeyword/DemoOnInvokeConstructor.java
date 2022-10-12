package org.tnsindia.thiskeyword;
//4.this keyword is invoking the current class constructor

class D
{
	//Default constructor
	D()
	{
		//this keyword is invoking the current class constructor
		this(5);
		System.out.println("Deflaut Constructor");
	}
	//Parameterized constructor
	D(int i)
	{
		System.out.println("Parameterized Construstor");
	}
}
public class DemoOnInvokeConstructor {

	public static void main(String[] args) {
		// object creation
		D c=new D();

	}

}
