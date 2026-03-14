package com.test;

public class Move0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {1,0,2,3,2,0,0,4,5,1};
        movezerostothend(arr);
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println("Elements "+arr[i]);
        }
        
	}
	//Brute Force by taking all the non zero elements in an array and then 
	//filling the array with the non zero elements followed by 0's.
	/*
	 * private static void movezerostothend(int[]arr) { int[] temp=new
	 * int[arr.length]; int nonzeroelementscount=0; for(int i=0;i<arr.length;i++) {
	 * if(arr[i]!=0) { temp[nonzeroelementscount]=arr[i]; nonzeroelementscount++; }
	 * 
	 * }
	 * 
	 * for(int i=0;i<temp.length;i++) { arr[i]=temp[i]; }
	 * 
	 * 
	 * 
	 * for(int i=0;i<arr.length;i++) { System.out.println("Elements "+arr[i]); }
	 * 
	 * 
	 * }
	 */
	//Optimal solution by two pointers approach,one pointer for zero and another for 
	 // iterating,then swap function not necessarily between two consecutive numbers
	private static void movezerostothend(int[]arr)
	{ // Pointer to track the position 
        // for next non-zero element
        int nonzero = 0;

        for (int i = 0; i < arr.length; i++) 
        	//loop starting from 0 and swapping,nonzero points to the 0th element to be swapped
        {

            // If the current element is non-zero
            if (arr[i] != 0) {

                // Swap the current element with
                // the 0 at index 'nonzero'
                int temp = arr[i];
                arr[i] = arr[nonzero];
                arr[nonzero] = temp;

                // Move 'nonzero' pointer to 
                // the next position
                nonzero++;
            }
        }
        }
}
// Time complexity=O(n) 