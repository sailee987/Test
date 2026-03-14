package com.test;

	import java.util.HashSet;
	import java.util.Set;
	import java.util.ArrayList;
	import java.util.List;

	public class ArrayIntersection {

	    /**
	     * Finds the intersection of two arrays using a brute-force approach.
	     * Each element in the result will be unique.
	     * Time complexity: O(n*m), where n and m are the lengths of the arrays.
	     *
	     * @param nums1 The first array.
	     * @param nums2 The second array.
	     * @return An array containing the unique elements present in both arrays.
	     */
		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
	     int a[]= {1,2,2,3,3,3,4,4,5,6};
	     int b[]= {3,3,4,5,5};
	     Set<Integer> set=intersection(a,b);
	     for(Integer s:set)
	     {
	    	 System.out.println("Elements "+s);
	     }
		}
		/*
		 * public static int[] intersectionBruteForce(int[] nums1, int[] nums2) { // Use
		 * a Set to store the intersection elements to automatically handle duplicates
		 * Set<Integer> intersectionSet = new HashSet<>();
		 * 
		 * // Iterate through each element of the first array for (int i = 0; i <
		 * nums1.length; i++) { // Iterate through each element of the second array for
		 * (int j = 0; j < nums2.length; j++) { // If a match is found if (nums1[i] ==
		 * nums2[j]) { // Add the common element to the set
		 * intersectionSet.add(nums1[i]); // Break the inner loop once a match is found
		 * for the current element // in nums1 to avoid adding duplicates based on
		 * multiple occurrences in nums2 break; } } }
		 * 
		 * // Convert the Set to an array int[] result = new
		 * int[intersectionSet.size()]; int index = 0; for (int num : intersectionSet) {
		 * result[index++] = num; }
		 * 
		 * return result; }
		 */

	   //TimeComplexity=O(n1*n2)
	    //Optimal approach
		public static Set<Integer> intersection(int[] nums1, int[] nums2)
		{
			int i=0,j=0;
			Set<Integer> set=new HashSet<>();
			while(i<nums1.length && j<nums2.length)
			{
				if(nums1[i]<nums2[j])
				{
					i++; //incrementing the first array
				}
				else if(nums1[i]>nums2[j])
				{
					j++; //incrementing the second array
				}
				else //when they are equal
				{
					set.add(nums1[i]);
					i++;
					j++;
				}
				
			}
			return set;
		}
	}


    

