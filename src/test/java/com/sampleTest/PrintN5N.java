package com.sampleTest;

public class PrintN5N {

	public static void main(String[] args) {

		String s="NARAYAN";
		
		//System.out.print(s.charAt(0));
		//System.out.print(s.length()-2);
		//System.out.print(s.charAt(s.length()-1));

		s=s.substring(0,1)+(s.length()-2)+s.substring(s.length()-1);
		System.out.println(s);
		
	}

}
