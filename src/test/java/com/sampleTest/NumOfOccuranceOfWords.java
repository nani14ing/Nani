package com.sampleTest;

import java.util.LinkedHashSet;

public class NumOfOccuranceOfWords {

	public static void main(String[] args) {
		/*
		String s="i love india and i love KA";
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
			System.out.println(word+"-->"+count);
		}
		*/
		
		int[] arr= {1,1,5,8,2,8,8,2};//output=print num of occurance of repeated array
		
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0; i<arr.length;i++) {
			set.add(arr[i]);
		}
		for(Integer num:set) {
			int count=0;
			for(int i=0;i<arr.length;i++) {
				if(num==arr[i]) {
					count++;
				}
				
			}
			if(count>1) {
				System.out.println(num+"-->"+count);
			}
		}
		
	}
}



