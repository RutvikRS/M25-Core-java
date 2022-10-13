package org.tnsindia.strings;

import java.util.Scanner;

public class DemoOnStringNewKeyword {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=new String(s.nextLine());
		System.out.println("Type something: ");
		System.out.println(str);
		s.close();
	}

}