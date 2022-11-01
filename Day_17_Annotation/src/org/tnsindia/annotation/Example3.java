package org.tnsindia.annotation;
class Parent1
{
	@Deprecated
	void print()
	{
		System.out.println("Hello Everyone");
	}
	@Deprecated
	void print1()
	{
		System.out.println("Cheers!");
	}
	
	
}
public class Example3 {

	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.print1();
		

	}

}
