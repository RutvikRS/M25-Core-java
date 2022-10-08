package org.tnsindia.superkeyword;
//super class
class Parent
{
	void print()
	{
		System.out.println("Welcome to M25 Batch");
	}
	void accept()
	{
		System.out.println("Parent Class");
	}
}
class Child extends Parent
{
	void print()
	{
		System.out.println("Congralutions you have completed screening test ");
	}
	void accept()
	{
		System.out.println("Child Class");
	}
	void display()
	{
		print();
		accept();
		super.print();
		super.accept();
	}
}
public class DemoOnSuperClassMethod 
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.display();
	}
}
