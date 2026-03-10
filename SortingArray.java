package com.test;

public class SortingArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,3,4,5,0};
		System.out.println("Is the array sorted "+isSorted(a));
     
	}
	private static boolean isSorted(int[] a)
	{
		boolean flag=false;
		for(int i=1;i<a.length;i++) //Note i<a.length and i=1 as a[i-1] is called
		{
		 if(a[i]>=a[i-1])
		 {
			flag=true; 
		 }
		 else
		 {
			 flag=false;
		 }
		}
		return flag;
	}

}
