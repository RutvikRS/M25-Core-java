package org.tnsindia.stringbuffer;

public class DemoOnStringBuffer {

	public static void main(String[] args)
	{
		StringBuffer s=new StringBuffer("");
		System.out.println(s.capacity()); // by default the capacity of empty string Buffer
		
		String s1="Today";
		StringBuffer sb=new StringBuffer(s1.length());
		System.out.println(sb.capacity());
		
		StringBuffer buff = new StringBuffer("Internet of things");
		System.out.println(buff.capacity()); //(16*2)+2
		buff = new StringBuffer(" ");
		System.out.println(buff.capacity());//space=1 +defaullt value 16=17
		
		StringBuffer sb1 = new StringBuffer("Good");
		sb1.append("Job");
		System.out.println(sb1);
		
		StringBuffer sb2= new StringBuffer("Java");
		System.out.println(sb2);
		System.out.println(sb2.charAt(1));
		sb1.setCharAt(1, 'a');
		System.out.println(sb2);
		System.out.println(sb2.charAt(1));
		
		StringBuffer sb3 = new StringBuffer("Try");
		System.out.println(sb3);
		//sb3.setCharAt(3,'x'); //Exception occurs
		//System.out.println(sb3);
		
	}
}
