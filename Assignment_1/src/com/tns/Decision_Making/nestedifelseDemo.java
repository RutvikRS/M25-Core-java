package com.tns.Decision_Making;
import java.util.Scanner;
public class nestedifelseDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value for age");
		int age=s.nextInt();
		System.out.println("Enter the Value for weight");
		int weight=s.nextInt();
		if(age>12) 
		{
			if(weight>=40) 
			{
				if(weight<=120)
				{
					System.out.println("You are eligible for bunjee jumping");	
				}
				else
				{
					System.out.println("Extra  Ropes will be added");
				}
				
			}
			else 
			{
				System.out.println("You are not eligible for bunjee jumping");
			}
		}
		else 
		{
			System.out.println("You are not eligible for bunjee jumping");
		}
		s.close();

	}
	

}
