package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collection;

//Demo on Collection Interface
public class DemoOnCollectionInterface {

	public static void main(String[] args) {
		Collection obj=new ArrayList<>();
		//adding the values
		obj.add("RS");
		obj.add(35);
		obj.add('Y');
		System.out.println(obj);
		

	}

}
