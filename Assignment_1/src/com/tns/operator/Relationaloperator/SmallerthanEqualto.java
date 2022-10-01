
package com.tns.operator.Relationaloperator;
import java.util.Scanner;
public class SmallerthanEqualto {

	public static void main(String[] args) {
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter THe Value Of A");
	     int a=s.nextInt();
	     System.out.println("Enter THe Value Of B");
	     int b=s.nextInt();
	     boolean res = a<=b;
	     System.out.println(" Condition is:" +res);
	     s.close();
	     

	}

}