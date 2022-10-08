package org.tnsindia.finalkeyword;

class FinalMethod
{
	//final method cannot be overridden
	/*
	 * final void accept()
	 * {
	 * 		System.out.println("Final method cannot be overridden");
	 * }
	 */
}
class Child extends FinalMethod
{
	void accept()
	{
		System.out.println("Child Class");
	}
}

public class DemoOnFinalmethods {
	public static void main(String[] args)
	{
		Child c=new Child();
		c.accept();
	}

}
