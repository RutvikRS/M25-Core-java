package org.tnsindia.finalkeyword;

class FinalClass
{
	protected String name="RS";
}
//final class cannot be inherited
/*final class FinalClass
 * {
 * 	protected String name="RS";
 * }
 */

 class ChildClass extends FinalClass
{
		public void print()
		{
			System.out.println(name);
		}
}
 public class DemoOnFinalclass
 {
	 public static void main(String[] args)
	 {
		 ChildClass c=new ChildClass();
		 c.print();
	 }
 }
