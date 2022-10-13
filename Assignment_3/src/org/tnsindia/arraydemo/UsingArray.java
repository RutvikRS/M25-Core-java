package org.tnsindia.arraydemo;
import java.util.Arrays;
public class UsingArray {
	static void display(int... a)
	{
		//Arrays.sort defines Array is a class and sort is a method which sort the values
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		display(26,17,35,10,8,58,20);
	}

}
