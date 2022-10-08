package org.tnsindia.superkeyword;
class Person
{
	//super class constructor
	Person()
	{
		System.out.println("Parent class constructor");
	}
}
class Students extends Person
{
	Students()
	{
		//to call the parent class constructor
         super();
         System.out.println("Child class Constructor");
	}
}

public class DemoOnSuperClassConstructor {
public static void main(String[] args)
{
	Students s=new Students();
	
}

}
