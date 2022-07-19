package com.sampleTest;

public class RevaStringByForEachLoopTest {

	public static void main(String[] args) {
		
		String s="india";
		String rev="";
				
	  char[] ch = s.toCharArray();
	  for(char c:ch)
	  {
		  rev=c+rev;
	  }
	  System.out.println(rev);

	}

}
