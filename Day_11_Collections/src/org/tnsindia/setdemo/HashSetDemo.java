package org.tnsindia.setdemo;
import java.util.HashSet;
import java.util.Set;
public class HashSetDemo {

	//@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//Set is an interface,we can't create the object for the set
		//Set s=new Set<>();
		//@SuppressWarnings("rawtypes")
		//1.HashSet is unordered and it does not contain duplicate element
		//2.set contain at most one null element
		Set<Object> s=new HashSet<>();
		s.add("RS");
		s.add('Y');
		s.add(44.54f);
		s.add(78);
		s.add("Rutvik");
		s.add("null");
		s.add("null");
		System.out.println("The elements in the set are: "+s);
	}

}
