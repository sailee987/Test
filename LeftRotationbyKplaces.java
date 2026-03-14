package com.test;

public class LeftRotationbyKplaces {
//Rotating the array by length of the array will bring back the original array,
//	(arr.length+1)%arr.length=1 and so on
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5}; //51234 45123 
    	int k=2; 
    	rotate(arr,k);  
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.println("Reversed elements "+arr[i]);
    	}
	}
	//Brute Force
	
	/*
	 * private static void rotate(int[] arr,int k) { k=k%arr.length; //Filling up
	 * the temp array
	 * 
	 * int temp[]=new int[k]; for(int i=0;i<k;i++) { temp[i]=arr[i]; } //Shifting
	 * for(int i=k;i<arr.length;i++) { arr[i-k]=arr[i]; } //Filling the rest,it can
	 * be written as arr[i]=j where j=0;j++ for(int i=arr.length-k;i<arr.length;i++)
	 * { arr[i]=temp[i-(arr.length-k)]; } for(int i=0;i<arr.length;i++) {
	 * System.out.println("Elements of the rotated array "+arr[i]); } //Time
	 * complexity=O(d)+O(n-d)+O(d)=O(n+d) //Space complexity=O(d) }
	 */
	//Optimal solution by reversing the first part,then second part and then the entire array, no extra array increasing the space
	private static void rotate(int[] arr,int k)
	{
		k=k%arr.length;
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		reverse(arr,0,arr.length-1);
	}
	private static void reverse(int[] arr,int start,int end)
	{
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}
