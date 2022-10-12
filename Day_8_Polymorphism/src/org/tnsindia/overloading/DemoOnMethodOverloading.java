package org.tnsindia.overloading;

//demo on method overloading-by passing the different data types
class MathematicalOperation
{
	//method overloading
	public void addition(int a,int b)
	{
		System.out.println("The sum is: "+(a+b));
	}
	public void addition(float a,float b)
	{
		System.out.println("The sum is: "+(a+b));
	}
}
public class DemoOnMethodOverloading {

	public static void main(String[] args) {
		MathematicalOperation mc=new MathematicalOperation();
		mc.addition(10, 20);
		mc.addition(15.5f, 33);
		

	}
}


