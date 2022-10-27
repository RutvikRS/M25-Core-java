package org.tnsindia.enumdemo;
//we can implement interface using enum
public enum EnumCardsDemo implements InterfaceCardsDemo {
	HEART,CLUB,DIAMOND,SPADES;

	@Override
	public void print() {
		System.out.println("Selected Shape in the cards are "+this);
		
	}
}