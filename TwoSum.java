package com.test;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] nums= {1,3,6,4,8};
     int[] arr=twoSum(nums,11);
     for(int i:arr)
     {
    	 System.out.println("Indices summing to two sum "+i);
     }
     
	}
	private static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> visited=new HashMap<>();
       int arr[]=new int[2]; 
     for(int i=0;i<nums.length;i++) 
     {
        int complement=target-nums[i];
        if(visited.containsKey(complement))
        {
            
            arr[0]=visited.get(complement);
            arr[1]=i;
        }
        visited.put(nums[i],i);
       
     } 
     return arr;
    }
}
