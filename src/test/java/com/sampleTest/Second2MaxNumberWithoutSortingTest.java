package com.sampleTest;

public class Second2MaxNumberWithoutSortingTest {

	public static void main(String[] args) {
		
		int a[]= {10,50,40,20,30};
		
		int Fmax=a[0];
		int Smax=a[0];
		
		for(int i=1; i<a.length; i++) {
			if(Fmax<a[i]) {
				
				Smax=Fmax;
				Fmax=a[i];
				
			}
			else if(a[i]>Smax) {
				Smax=a[i];
			}
		}

		System.out.println(Fmax);
		System.out.println(Smax);
	}

}
