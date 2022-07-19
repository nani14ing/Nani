	package com.sampleTest;

public class Second2MinNumberWithoutSoritngTest {

	public static void main(String[] args) {
		
	int a[]= {70,50,30,100,40};
		
		int Fmin=a[0];
		int Smin=a[0];
		
		for(int i=1; i<a.length; i++) {
			if(Fmin>a[i]) {			
				Smin=Fmin;
				Fmin=a[i];
				
			}
			else if(a[i]<Smin) {
				Smin=a[i];
			}
		}
		System.out.println(Fmin);
		System.out.println(Smin);
	}
}
