package com.test;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a= {7,9,6,0,4,4,2,1,8,11,10};
		int largest=a[0];
		int secondlargest=-1;
		//Brute Force solution
		/*
		 * Arrays.sort(a); largest=a[a.length-1]; for(int i=a.length-2;i>=0;i--) {
		 * if(a[i]!=largest) { secondlargest=a[i]; break; } }
		 * System.out.println("Largest element "+largest
		 * +"  Second largest "+secondlargest); Time complexity=Olog(n)+n //for sorting
		 * and running the loop
		 */	
		
		//Better approach
		for(int i=0;i<a.length;i++)
		{
			if(a[i]> largest)
			{
				largest=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>secondlargest && a[i]<largest)
			{
				secondlargest=a[i];
			}
		}
		System.out.println("Largest "+largest +"SecondLargest "+secondlargest);
		//Time complexity =O(2(n))
		//Optimal solution
		 /*largest=a[0];
		 secondlargest=-1;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>largest)
			{
				secondlargest=largest;
				largest=a[i];
			}
			else if(a[i]>secondlargest && a[i]<largest)
			{
				secondlargest=a[i];
			}
			
		}
		System.out.println("Second largest "+secondlargest);
		
		Time complexity=O(n)
		*
		*/
	}

}
