package org.tnsindia.stringbuilder;

public class DemoOnStringBuilder {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("");
		System.out.println(s.capacity());
		
		StringBuilder s1 = new StringBuilder("Hardwork");
		System.out.println(s1);
		
		String s2 = "Tomorrow";
		StringBuffer sb = new StringBuffer(s2.length());
		System.out.println(sb.capacity());
		
		//append = add a word at the end of the string
		StringBuilder sb1=new StringBuilder("Smart");
		sb1.append(" Work");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb2.capacity());
		sb2.append("Hive");
		System.out.println(sb2.capacity());
		sb2.append("Java is my favourite language");
		System.out.println(sb2.capacity());

	}

}