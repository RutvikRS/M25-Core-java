package org.tnsindia.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<String> s=new TreeSet<>();
		s.add("Rutvik");
		s.add("Yogesh");
		s.add("chits");
		s.add("Pratik");
		System.out.println("The elements in the TreeSet are: "+s);
	}

}
