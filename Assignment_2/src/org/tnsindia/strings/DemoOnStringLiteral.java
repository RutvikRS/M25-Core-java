package org.tnsindia.strings;

import java.util.Scanner;
public class DemoOnStringLiteral {

	public static void main(String[] args) {
		String str="Rutvik Sakpal";
		System.out.println(str);
		System.out.println("Enter any name:");
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		System.out.println(str1);
		s.close();
	}

}
