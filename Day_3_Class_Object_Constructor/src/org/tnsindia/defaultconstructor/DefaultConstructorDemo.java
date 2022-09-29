package org.tnsindia.defaultconstructor;
//Class definition
class Car{
	//variable
	private int speed;
	//Method
	void display() {
		System.out.println("The speed is: "+speed+"km/hr");
	}
	//Default Constructor
	Car(){
		speed=50;
	}
}

public class DefaultConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object Creation
		Car obj=new Car();
		//Calling the method of car class
		obj.display();
	}

}