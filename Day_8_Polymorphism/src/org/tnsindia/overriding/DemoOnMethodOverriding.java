package org.tnsindia.overriding;
import java.util.Scanner;
//parent class
class HeadQuaters
{
	protected int totalemp;
	protected String city;
	Scanner s=new Scanner(System.in);
	public void getDetails()
	{
		System.out.println("Enter the city where HeadQuaters is situated: ");
		city=s.nextLine();
		System.out.println("Enter the total no.of employees in thar city heaquaters");
		totalemp=s.nextInt();
	}
	public void showDetails()
	{
		System.out.println("Company is located in :"+city+"and the no. of employees is:"+totalemp);
	}
}
//child class
class MainBranch extends HeadQuaters
{
	public int totalempMB;
	public String citynameMB;
	//method Overriding
	public void getDetails()
	{
		System.out.println("HeadQuaters");
		super.getDetails();
		System.out.println("Main branch");
		
		System.out.println("Enter the city where Main -Branch is situated");
		s.nextLine();//to give the input in anew line
		citynameMB=s.nextLine();
		System.out.println("Enter the total no. of employees in the main branch");
		totalempMB=s.nextInt();
		
	}
	//method Overriding
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Main Branch");
		System.out.println("Company is located in : "+citynameMB+" and the no. of employees is: "+totalempMB);
		
		
		
	}
}
public class DemoOnMethodOverriding {

	public static void main(String[] args) {
		MainBranch m=new MainBranch();
		m.getDetails();
		m.showDetails();

	}

}
