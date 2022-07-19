package com.sampleTest;

public class FirstMaxWithoutBubbleSortTest {

	public static void main(String[] args) {
		
		int a[]= {100,90,150,70,120,50};
		int max=a[0];
		
		for(int i=1; i<a.length; i++) {
			
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
