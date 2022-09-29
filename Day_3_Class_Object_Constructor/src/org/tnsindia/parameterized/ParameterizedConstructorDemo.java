package org.tnsindia.parameterized;

import java.util.Scanner;
//Demo on parameterized constructor
class Bike {
	public int speed;
	
	Bike(int s){
		speed=s;
		System.out.println("The speed is: "+speed+"km/hr");
	}
}	

public class ParameterizedConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of speed: ");
		int speed=s.nextInt();
		Bike b=new Bike(speed);
		s.close();
	}

}