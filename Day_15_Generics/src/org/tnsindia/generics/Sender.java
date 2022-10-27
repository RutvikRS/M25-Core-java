package org.tnsindia.generics;
//Generic Class 
public class Sender <T>{
	private T message;

	public T getMessage() {
		return message;
	}

	public void setMessage(T message) {
		this.message = message;
	}
	
	public void sendMessage()
	{
		System.out.println("Message Type: "+getMessage().getClass());
		System.out.println("Contents Type: "+getMessage());
	}

}
