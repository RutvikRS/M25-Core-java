package org.tnsindia.strings;

import java.util.Scanner;

public class DemoOnStringLength {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String string="Student";
		System.out.println(str1.length());
		System.out.println("Character at 2nd pos: "+str1.charAt(1));
		System.out.println("Character at 3rd pos: "+str1.charAt(4));
		System.out.println("Character at 6th pos: "+str1.charAt(7));
		System.out.println("String in lower case is: "+str1.toLowerCase());
		System.out.println("String in upper case is: "+str1.toUpperCase());
		System.out.println("Hello"+" World"+10+20); //String concatenation
		System.out.println(str1.concat(string));
		s.close();
	}
}