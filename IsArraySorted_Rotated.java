package com.test;

public class IsArraySorted_Rotated {

	public static void main(String[] args) {
		 int[] arr = { 3, 4, 5, 1, 2 };

	        // Get the size of the array
	        int n = arr.length;

	        // Call the check function and determine if the
	        // array is rotated and sorted
	        if (check(arr, n))
	            // Print YES if the array is rotated and sorted
	            System.out.println("YES");
	        else
	            // Print NO if the array is not rotated and
	            // sorted
	            System.out.println("NO");
	    }

	
	public static boolean check(int[] arr, int n)
    {
        // Initialize count of the number of times the
        // sequence is out of order
        int count = 0;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Check if the current element is greater than
            // the next element
            if (arr[i] > arr[(i + 1) % n]) {
                // Increment count if the sequence is out of
                // order
                count++;
            }
        }

        // Return true if there is at most one point where
        // the sequence is out of order
        return count <= 1;
    }
}
