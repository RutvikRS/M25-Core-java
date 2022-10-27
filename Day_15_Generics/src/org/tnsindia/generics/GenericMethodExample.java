package org.tnsindia.generics;

public class GenericMethodExample {
	//when we use generic method we can pass any type of arguments in the method
	public static <E>void printArray(E[] elem)
	{
		for(E itr:elem)
		{
			System.out.println(itr.getClass().getName()); //to check the class Name
			System.out.println(itr);
		}
	}
	public static void main(String[] args) {
		Integer[] arr1= {10,20,30};
		Character[] arr2= {'z','d','h','f'};
		System.out.println("Printing Array for Integer");
		printArray(arr1);
		System.out.println("Printing Array for Character");
		printArray(arr2);

	}

}
