package org.tnsindia.arraydemo;

import java.util.Scanner;

public class ArrayDemoUserInput {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		//array declaration
		int arr[]=new int[size];
		System.out.println("Enter the value");
		//to enter the elements int the array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+i+" index");
			arr[i]=s.nextInt();
		}
		//to print the elements in the array
		/*for(int i=0;i<arr.length;i++)
		 * {
		 * 	System.out.println(arr[i]);
		 * }
		 * 
		 */
		//enhanced for loop
		for(int j:arr)
		{
			System.out.println(j);
		}
		s.close();
		
	}

}
