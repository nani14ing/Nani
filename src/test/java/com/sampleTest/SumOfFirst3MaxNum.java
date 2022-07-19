package com.sampleTest;

public class SumOfFirst3MaxNum {

	public static void main(String[] args) {
		
		int a[]= {50,20,80,100,60,90,10};
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			
			 for(int j=0; j<a.length;j++) {
				 
				 if(a[i]>a[j]) {
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		}	
		for(int i=0; i<3 ;i++) {
			sum=sum+a[i];
			//System.out.println(a[i]+ " ");
		}
			System.out.println(sum);	
	}
}
