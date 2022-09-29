package org.tnsindia.parameterized;
import java.util.Scanner;
//Demo on default and parameterized constructor

class Bus{
	public int speed;
	//Parameterized Constructor
	Bus (int s){
		speed=s;
		System.out.println("The speed is: "+speed+"km/hr");
	}
	//Default Constructor
	public Bus(){
		System.out.println("Default Constructor");
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of speed: ");
		int speed=s.nextInt();
		Bus b=new Bus(speed);
		Bus b1=new Bus();
		s.close();

	}

}