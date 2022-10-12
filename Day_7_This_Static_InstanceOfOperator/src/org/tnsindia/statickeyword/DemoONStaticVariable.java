package org.tnsindia.statickeyword;
class B{
	static int a=56;
}
//Static keyword with variable
public class DemoONStaticVariable {
	
	/*
	 * IF WE DECLARE ANY VARIABLE OUTSIDE THE MAIN FUNCTION AND WE PRINT THAT VAR WITHOUT STATIC
	 * THEN WE WILL GET THE ERROR...FOR THAT PURPOSE WE HAVE TO USE STATIC KEYWORD 
	 */
	public static void main(String[] args) {
		
		System.out.println(B.a);

	}

}
