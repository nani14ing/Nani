package com.sampleTest;

public class SwapFirst2numtoLastTest {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};	
		for(int j=0; j<2; j++) {
			
			int temp=a[0];
					
			for(int i=1; i<a.length;i++) {
				
				a[i-1]=a[i];
			}
			a[a.length-1]=temp;
		}
		
			for(int i=0; i<a.length; i++) {
				System.out.print(a[i]+" ");
			}
			
		}

}



