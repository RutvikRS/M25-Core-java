package org.tnsindia.enumdemo;

import java.util.Scanner;

import org.tnsindia.enumdemo.PizzaEnumDemo.Size;

public class PizaaEnumExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the Pizza: ");
		String size=s.nextLine();
		//converting the size string to enum-size of the pizza
		Size s1=Size.valueOf(size.toUpperCase());
		switch(s1)
		{
		case SMALL:
			System.out.println("Preparing Small Pizza For the customer");
			break;
			
		case MEDIUM:
			System.out.println("Preparing Medium Pizza For the customer");
			break;
			
		case LARGE:
			System.out.println("Preparing Large Pizza For the customer");
			break;
			
		case EXTRALARGE:
			System.out.println("Preparing ExtraLarge Pizza For the customer");
			break;
			
			
		}
	}

}