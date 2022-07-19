package com.sampleTest;

import java.util.LinkedHashSet;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class PrintDuplicateWords {

	public static void main(String[] args) {
		
		String s="welcome to Tyss and welcome to india";
		String[] str=s.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		
		for(String word:set)
		{
			int count=0;
			for(int i=0; i<str.length; i++)
			{
				if(word.equals(str[i]))
				{
					count++;
				}
			}
			if(count>1) {
				System.out.println(word+"-->"+count);
			}
		}		
	}
}
