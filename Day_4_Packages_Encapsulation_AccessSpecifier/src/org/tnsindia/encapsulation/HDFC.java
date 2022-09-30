package org.tnsindia.encapsulation;
//Program on Encapsulation
public class HDFC {
	
	//Achieving using private data members
	private int pin_no;
	/*if any variable is declared as a private and if u want to access 
	 * into another class then use getters and setters method
	 */

	public int getPin_no() {
		return pin_no;
	}

	public void setPin_no(int pin_no) {
		this.pin_no = pin_no;
	}
	
	//getters and setters method for private variable pin_no
	

}
