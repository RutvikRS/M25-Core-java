package com.tns.operator.UnaryOperator;

import java.util.Scanner;

public class unaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	     System.out.println("Enter THe Value Of A");
	     int a=s.nextInt();
	     System.out.println("Enter THe Value Of B");
	     int b=s.nextInt();
	     int x=a++;
	     int y=++b;
	     int z=a+x;
	     System.out.println(z);
	     s.close();
	}

}
