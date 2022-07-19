package com.sampleTest;

public class MinLenghtOfStringTest2 {

	public static void main(String[] args) {
		
		  String str[]= {"hello","hey","key","byee","welcome","tyss"};
		  
		  String min=str[0];
		  
		  for(int i=0; i<str.length; i++) {
			  if(min.length()>str[i].length()) {
					min=str[i];
				}
			}
			
			for(int i=0; i<str.length; i++) {
				if(min.length()==str[i].length()) {
					System.out.println(str[i]);
				}
			}
	
		  }

}
