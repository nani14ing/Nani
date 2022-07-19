package com.sampleTest;

import java.util.LinkedHashSet;

public class RepeatedCarsTest {

	public static void main(String[] args) {
		
		String s="carbuscarbikecarautocar";		
		int count=0;
		for(int i=0;i<s.length();i++) {
			
			for(int j=i+2; j<s.length();j++)
			{
				if(s.subSequence(i, j).equals("car"))
				{
					count++;
				}
			}	
		}
		System.out.println(count);
	}
}
