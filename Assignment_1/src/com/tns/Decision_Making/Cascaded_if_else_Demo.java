package com.tns.Decision_Making;

import java.util.Scanner;

public class Cascaded_if_else_Demo 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value for a");
		int a=s.nextInt();
		System.out.println("Enter the Value for b");
		int b=s.nextInt();
		System.out.println("Enter the Value for c");
		int c=s.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if(b<a && b<c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
		s.close();
	}
}
