package com.tns.Decision_Making;
import java.util.Scanner;
public class if_else_demo 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value for a");
		int a=s.nextInt();
		System.out.println("Enter the Value for b");
		int b=s.nextInt();
		
		if(a>b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
		s.close();
	}
	

}
