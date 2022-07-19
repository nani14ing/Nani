package com.sampleTest;

import java.util.LinkedHashSet;

public class NumOfOccuranceOfeachChar {

	public static void main(String[] args) {
		
		String s="india";	
		//step1-->to add all the characters into set type of collection
	LinkedHashSet<Character> set=new  LinkedHashSet<Character>();
	for(int i=0; i<s.length(); i++)
	{
		set.add(s.charAt(i));
	}	
	//step2-->Compare each every element of set with all the char of string
	for(char ch:set)
	{
		int count=0;
		for(int i=0; i<s.length(); i++) {
			if(ch==s.charAt(i))
			{
				count++;        //step3-->if matching, increment the count
			}
		}
		System.out.println(ch+"-->"+count);   	//step4--> print the character...and count..
	}
  }
}
	    
			
	
