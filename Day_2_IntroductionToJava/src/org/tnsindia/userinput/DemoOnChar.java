package org.tnsindia.userinput;
import java.util.Scanner;

public class DemoOnChar {
//Program for testing character
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any Character: ");
		char a=s.next().charAt(2);
		System.out.println("The Character at 2nd Index is: "+a);
		s.close();

	}

}
