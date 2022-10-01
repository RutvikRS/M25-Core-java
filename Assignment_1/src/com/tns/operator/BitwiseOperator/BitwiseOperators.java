package com.tns.operator.BitwiseOperator;

import java.util.Scanner;

public class BitwiseOperators {
	public static void main(String[] args) {
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter The Value Of A");
	     int a=s.nextInt();
	     System.out.println("Enter The Value Of B");
	     int b=s.nextInt();
	     int res=a & b;
	     int res1=a | b;
	     int res2=a^b;
	     int res3=a<<b;
	     System.out.println(" Values of  a & b:" +res);
	     System.out.println(" Values of  a | b:" +res1);
	     System.out.println(" Values of  a ^ b:" +res2);
	     System.out.println(" Values of  a << b:" +res3);
	     s.close();
	     

	}

}

