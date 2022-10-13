package org.tnsindia.stringtokenizer;

import java.util.StringTokenizer;

public class DemoOnStringTokenizer {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Lets try this");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}