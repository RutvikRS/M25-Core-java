package org.tnsindia.abstraction;
//Demo on public access specifiers
class B{
	public String dob="07-01-2001";
	
	//if the data members is public the visibility is in any class
	public void display() {
		System.out.println("The date of birth is : "+dob);
	}
}
public class DemoOnPublic {

	public static void main(String[] args) {
		
		B b=new B();
		b.display();
	}

}