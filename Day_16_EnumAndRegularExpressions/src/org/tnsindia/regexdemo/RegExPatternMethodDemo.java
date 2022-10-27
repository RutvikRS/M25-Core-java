package org.tnsindia.regexdemo;

import java.util.Scanner;
//Demo on matches method for method demo class
public class RegExPatternMethodDemo {

	public static void main(String[] args) {
		String pattern="Vrushali Varankar";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input for a matching");
		String input=s.nextLine();
		boolean result=pattern.matches(input);
		System.out.println(result);
		s.close();
	}

}