 package org.tnsindia.generics;
// Demo on advantages of Generic concept
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsAdvantageDemo {

	public static void main(String[] args) {
		List<Integer> obj=new LinkedList<>();
		obj.add(12);
		//1.Type safety
		//obj.add("15");
		//3. Compile Time checking
		System.out.println(obj);
		//2. Type-Casting is not required
		List <Integer>obj2=new ArrayList<>();
		obj2.add(15);
		
		Integer	 d=obj2.get(0);
		System.out.println(obj2);
	}

}