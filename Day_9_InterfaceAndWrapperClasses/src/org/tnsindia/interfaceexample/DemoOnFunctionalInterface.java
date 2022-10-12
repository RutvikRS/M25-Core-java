package org.tnsindia.interfaceexample;
//example on FunctionalInterface
/*
 * we can use the @FunctionalInterfaces annotation to ensures that times there is
 * not more than one abstract method in a functional interface
 */
interface FunctionalInterface{
	/*FunctionalInterface contains exactly one abstract one abstract  method*/
	void accept(String msg);
}
class FunctionalInterFaceeExample implements FunctionalInterface{
	public void accept(String msg)
	{
		System.out.println(msg);
	}
}
public class DemoOnFunctionalInterface {

	public static void main(String[] args) {
		FunctionalInterFaceeExample f=new FunctionalInterFaceeExample();
		f.accept("Hello There");

	}

}
