package org.tnsindia.generics;
//Generic Class Example
public class GenericsClassExample<T> {
	T num;
	//method
	public void show()
	{
		System.out.println(num.getClass().getName());
	}
	public static void main(String[] args) {
		//Instead of collections I have used Generics class name and generics comcept
		GenericsClassExample<Double>obj=new GenericsClassExample<>();
		obj.num=13.8;
		obj.show();
	}

}