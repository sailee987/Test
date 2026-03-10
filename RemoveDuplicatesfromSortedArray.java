package com.test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,1,2,2,3,3,3,4};
		
		System.out.println("Number of unique elements in the set "+removeDuplicates(arr));

	}
	//Brute Force Technique :Time complexity: Olog(n)+n, Space complexity=O(n)
	/*
	 * private static int removeDuplicates(int[] arr) { Set<Integer>
	 * uniqueElements=new HashSet<>(); //int[] sizearr=new int[arr.length]; for(int
	 * i=0;i<arr.length;i++) { uniqueElements.add(arr[i]); } return
	 * uniqueElements.size(); }
	 */
	//Optimal solution by using two pointers approach
	private static int removeDuplicates(int[] arr)
	{
		int i=0;
		for(int j=1;j<arr.length;j++)
		{
			if(arr[i]!=arr[j])
			{
				arr[i+1]=arr[j];
				i++;
			}
			
		}
		return (i+1);
	}
	

}
