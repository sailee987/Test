package com.test;

public class LargestIntegerProblem {

	public static void main(String[] args) 
	{
		int nums[]= {3, 3, 0, 99, -40};
		largestElement(nums);
	}
		    private static int largestElement(int[] nums) {
		        int largest=nums[0];
		      for(int i=0;i<nums.length;i++)
		      {
		        
		       if(nums[i]>largest)
		       {
		         largest=nums[i];
		       }
		      }
		      return largest;
		    }
		
		 // This will throw a NoSuchElementException if the array is empty
			/*
			 * int max = Arrays.stream(numbers) .max() .orElseThrow();
			 */
	

}
