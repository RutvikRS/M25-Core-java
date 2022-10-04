package org.tnsindia.Inheritance;
//Parent class
class AndroidVersion
{
	protected String name;
	public void display()
	{
		System.out.println(name);
	}
}
//child class 1
class Tiramisu extends AndroidVersion
{
	protected String v13="Tiramasu";
	public void display()
	{
		System.out.println(v13);
	}
}
//child class 2
class Snowcone extends AndroidVersion
{
	protected String v12="Snowcone";
	public void display()
	{
		System.out.println(v12);
	}
}
	


public class HierachicalInheritance {

	public static void main(String[] args) {
		Tiramisu t=new Tiramisu();
		t.display();
		Snowcone s=new Snowcone();
		s.display();
		t.display();
	}

}
