package com.sampleTest;

public class RevAStringWithout3rdVarTest {

	public static void main(String[] args) {
	
		String s="india";
		
		for(int i=s.length()-1;i>=0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}
