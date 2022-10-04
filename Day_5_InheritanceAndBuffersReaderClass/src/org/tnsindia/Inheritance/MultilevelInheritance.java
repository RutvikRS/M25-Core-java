package org.tnsindia.Inheritance;
import java.util.Scanner;
//Parent class
class Vehicle
{
	protected String name;
	public void Display()
	{
		System.out.println(name);
	}
}
//Child Class For Vehicle
class BMW extends Vehicle
{
	protected String name1;
	public void Display1()
	{
		System.out.println(name1);
	}
}
//Child Class For BMW
class Tyres extends BMW
{
	protected String name2;
	public void Display2()
	{
		System.out.println(name2);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Tyres t=new Tyres();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Vechile name");
		String s1=s.nextLine();
		System.out.println("Enter The BMW Vechile name");
		String s2=s.nextLine();
		System.out.println("Enter The Tyres name");
		String s3=s.nextLine();
		
		t.name=s1;
		t.name1=s2;
		t.name2=s3;
		t.Display();
		t.Display1();
		t.Display2();
		s.close();
		

	}

}
