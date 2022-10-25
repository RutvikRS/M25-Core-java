package org.tnsindia.lambdaexpdemo;

@FunctionalInterface
public interface MaxFinderDemo {
    //1.Functional  contains exactly one abstract method
	//abstract method
	//void max(int a,int b);
	int max(int a,int b);
}
/*we have implemented functional interfaces by using child class
 * but here the length of the code is increased,
 * so we have another way that is lambda expression
 * 
*/