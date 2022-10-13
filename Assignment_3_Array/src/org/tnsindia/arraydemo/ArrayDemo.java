package org.tnsindia.arraydemo;



public class ArrayDemo {

	public static void main(String[] args) {
		/*int arr[4]= new  int[4] {11,13,14};
		 * Do not declare the size at the end if you are initializing the array
		*/
		int arr[]= new  int[] {11,13,14};
		System.out.println("The array index value is: "+arr[1]);
		//Array index out of bound exception as index is 3 we are accessing and last index is 2
		//System.out.println("The array index value is: "+arr[3]);
	}

}