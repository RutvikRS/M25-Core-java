package org.tnsindia.strings;

public class Example1 {

	public static void main(String[] args) {
		//String str="Hello";
		String str="Hello";
		String str1=new String("Hello");
		String str2=new String("Hello");
		System.out.println(str==str2);
		System.out.println(str1.equals(str2));
		//output will be true

	}

}
