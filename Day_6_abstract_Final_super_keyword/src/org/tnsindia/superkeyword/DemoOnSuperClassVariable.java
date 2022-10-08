package org.tnsindia.superkeyword;
//Parent class or Super  class or Base class
class Animal
{
	protected String name="Animal";
}
class Dog extends Animal
{
	public String name="Dog";
	//method overriding
	void display()
	{
		System.out.println("The name of animal is : "+name);
		System.out.println(super.name);
	}
}

public class DemoOnSuperClassVariable {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.display();
	}

}
