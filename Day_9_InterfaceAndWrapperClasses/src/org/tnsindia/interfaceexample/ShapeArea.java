package org.tnsindia.interfaceexample;

import java.util.Scanner;

//child class to implements the methods of interface
public class ShapeArea implements Area{

	public static void main(String[] args) {
		
	}

	@Override
	public void circle() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of a circle");
		double r=s.nextDouble();
		System.out.println("The area of Circle is:" +3.14*r*r);
		s.close();
		
	}

	@Override
	public void square() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the side of a square");
		double side=s.nextDouble();
		System.out.println("The side of a square is:" +side*side);
		s.close();
		
	}

}
