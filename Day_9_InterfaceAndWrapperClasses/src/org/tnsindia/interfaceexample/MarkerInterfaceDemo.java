package org.tnsindia.interfaceexample;

import java.util.Scanner;
//Marker Interface
/*A marker called ThreadSafe can communicate to other developers
 * that classes implementing this marker interface give a thread-safe guarantee,
 * and any modification should not violate that
 * 
 */
interface Clonable{
	/*It is an empty interface (no field or methods).Examples of marker interface are
	 * Serilalizable,
	 * Cloneable and Remote interface.
	 * all these interfaces are empty interfaces.
	 * NORE:-If we not use Clonable as interface still its run because Clonable is marker interface
	 * 
	 * 
	 * 
	 */
}
class Product implements Cloneable
{
	public int pid;
	public String pname;
	public double pcost;
	//Product class constructor
	public Product (int pid,String pname,double pcost)
	{
		this.pid=pid;
		this.pname=pname;
		this.pcost=pcost;
		
	}
	//method that prints the detail on the console
	public void showDetail()
	{
		System.out.println("Product ID:"+pid);
		System.out.println("Product Name:"+pname);
		System.out.println("Product pcost:"+pcost);
		
	}
}
public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		
		//reading values of the product from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product ID: ");
		int pid=sc.nextInt();
		System.out.println("Enter product Name: ");
		String pname=sc.next();
		System.out.println("Enter product Cost: ");
		double pcost=sc.nextDouble();
		System.out.println("-----Product Detail-----");
		Product p1=new Product(pid,pname,pcost);
		//cloning the object of the Product class using the clone() method
		p1.showDetail();
		sc.close();
		

	}

}
