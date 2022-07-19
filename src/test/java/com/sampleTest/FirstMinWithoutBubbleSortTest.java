package com.sampleTest;

public class FirstMinWithoutBubbleSortTest {

	public static void main(String[] args) {
		
		int a[]= {100,90,150,70,120,50};
		int min=a[0];
		
		for(int i=1; i<a.length; i++) {
			
			if(min>a[i]) {
				min=a[i];
			}
		}
		 System.out.println(min);
	}

}
