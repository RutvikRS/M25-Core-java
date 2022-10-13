package org.tnsindia.strings;

import java.util.Scanner;

public class DemoOnTestingStringOutput {

	public static void main(String[] args) {
		String str="Rohit";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any cricketer name: ");
		String str1=s.nextLine();
		if(str1.equals(str))
			System.out.println("Matching");
		else
			System.out.println("Not Matching");
		s.close();
	}
}