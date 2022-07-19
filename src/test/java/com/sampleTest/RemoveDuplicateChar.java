package com.sampleTest;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
	
		String s="india";
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++) {
			set.add(s.charAt(i));
		}
		for(char ch:set) {
			System.out.print(ch);
		}
	}

}
