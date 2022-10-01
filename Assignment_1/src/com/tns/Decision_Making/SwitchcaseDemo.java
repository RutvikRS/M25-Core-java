package com.tns.Decision_Making;

import java.util.Scanner;

public class SwitchcaseDemo 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value for a");
		int a=s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Pune");
			break;
		case 2:
			System.out.println("Mumbai");
			break;
		case 3:
			System.out.println("Delhi");
			break;
		case 4:
			System.out.println("Chennai");
			break;
		default:
			System.out.println("Invalid Input");
		}
		s.close();
		
		
	}
}
