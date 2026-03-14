package com.test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,2};
		
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
		int uniqueelement=0; //1,1,2
		for(int i=1;i<arr.length;i++) //no swapping,traversing from 1, First element is already unique, so scanning starts from the second element.”
		{
			if(arr[i]!=arr[uniqueelement])
			{
				arr[uniqueelement+1]=arr[i];
				uniqueelement++;
			}
			
		}
		return (uniqueelement+1);
	}
	

}
