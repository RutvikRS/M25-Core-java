package org.tnsindia.generics;

public class Executor {
	
	public static void main(String[] args) {
		//create a sender to send a string message
		Sender<String>obj=new Sender<>();
		obj.setMessage("Generic class Demo");
		obj.sendMessage();
		System.out.println();
		
		//create an email object to be send using the sender
		Email em=new Email();
		em.setFrom("rutviksakpal@gmail.com");
		em.setTo("chits2004@gmail.com");
		em.setSubject("Java Full Stack");
		em.setBody("About Training And Placement");
		
		System.out.println(em.getBody());
		//Create a sender to send this email
		Sender<Email>obj1=new Sender<Email>();
		obj1.setMessage(em);
		//obj1.getMessage();
		obj1.sendMessage();
	}

}
