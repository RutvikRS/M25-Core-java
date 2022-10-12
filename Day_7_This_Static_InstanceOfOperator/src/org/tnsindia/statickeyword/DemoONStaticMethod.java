package org.tnsindia.statickeyword;
//Static keyword with Method
class A
{
		//non static method
		int add(int a,int b)
		{
			return a+b;
		}

//static method
public static void display()
{
	System.out.println("Welcome to Java stack Training");
}
}
public class DemoONStaticMethod {

	public static void main(String[] args) {
		/*without creating any object for a class we can access that method by making
		 * that method as static
		 * classBame.Methodname();
		 * 
		 */
		
		A.display();
	}

}
