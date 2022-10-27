package org.tnsindia.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxExceptionDemo {
	private static String REGEX="[";
	private static String INPUT="I love Mumbai"+ "Mumbai is famous for bollywood city";
	private static  String REPLACE="cat";
	
	public static void main(String[] args) {
		try {
			Pattern pattern=Pattern.compile(REGEX);
			
			//get matcher object
			Matcher matcher=pattern.matcher(INPUT);
			INPUT=matcher.replaceAll(REPLACE);
			
		}
		catch(PatternSyntaxException e)
		{
			System.out.println("PatternSyntaxException");
			System.out.println("Decription: "+e.getDescription());
			System.out.println("Index: "+e.getIndex());
			System.out.println("Message: "+e.getMessage());
			System.out.println("Pattern: "+e.getPattern());
		}
	

	}

}