

package com.tns.operator.Assignmentoperator;
import java.util.Scanner;
public class Assignmentoperators{

	public static void main(String[] args) {
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter The Value Of A");
	     int a=s.nextInt();
	     System.out.println("Enter The Value Of B");
	     int b=s.nextInt();
	     int c = a+=b;
	     int c1= a-=b;
	     int c2= a/=b;
	     int c3= a*=b;
	     int c4= a%=b;
	     int c5= a=b;
	     System.out.println(" Values is :" +c);
	     System.out.println(" Values is :" +c1);
	     System.out.println(" Values is :" +c2);
	     System.out.println(" Values is :" +c3);
	     System.out.println(" Values is :" +c4);
	     System.out.println(" Values is :" +c5);
	     
	     s.close();
	     

	}

}
