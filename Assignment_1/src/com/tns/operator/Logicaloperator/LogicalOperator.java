package com.tns.operator.Logicaloperator;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	     System.out.println("Enter THe Value Of A");
	     int a=s.nextInt();
	     System.out.println("Enter THe Value Of B");
	     int b=s.nextInt();
		boolean res= (a<b && b<a);
		boolean res1= (a<b || b<a);
		boolean res2= !(a<b);
		
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		s.close();
		
		
		
		
		

	}

}
