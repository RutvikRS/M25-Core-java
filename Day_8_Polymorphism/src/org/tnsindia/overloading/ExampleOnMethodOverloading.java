package org.tnsindia.overloading;
//Demo on method overloading by changing the number of arguments
class Shape
{
	//method overloading
	//zero-argument
	public void area()
	{
		System.out.println("Find area: ");
		
	}
	//one-argument
	public void area(int r)
	{
		System.out.println("Area of Triangle is :"+(3.14*r*r));
	}
	//two-argument
	public void area(int l,int b)
	{
		System.out.println("Area of Rectangle is :"+(l*b));
	}
}
public class ExampleOnMethodOverloading {

	public static void main(String[] args) {
		Shape s=new Shape();
		s.area();
		s.area(7);
		s.area(7, 8);

	}

}
