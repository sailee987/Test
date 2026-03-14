package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionoftwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr1= {1,1,2,3,3,4,5};
    int[] arr2= {2,3,4,4,5};
    unionofuniqueelements(arr1,arr2);
	}
	//Brute Force
	/*
	 * private static void unionofuniqueelements(int[] arr1,int[] arr2) {
	 * Set<Integer> unionset=new HashSet<>(); for(int i=0;i<arr1.length;i++) {
	 * unionset.add(arr1[i]); } for(int j=0;j<arr2.length;j++) //common elements {
	 * unionset.add(arr2[j]);
	 * 
	 * } int[] arr3=new int[unionset.size()]; for(int i: unionset) { arr3[i-1]=i; }
	 * for(int i=0;i<arr3.length;i++) { System.out.println("Element "+arr3[i]); } }
	 */
	private static void unionofuniqueelements(int[] arr1,int[] arr2)
	{
	 List<Integer> unionList = new ArrayList<>();
    int i = 0, j = 0; //i,j are array scanners (fast pointers) which scans even if not added
    int n = arr1.length;
    int m = arr2.length;

    while (i < n && j < m) 
    {
        // Skip duplicates in arr1
        if (i > 0 && arr1[i] == arr1[i - 1]) {
            i++;
            continue;
        }
        // Skip duplicates in arr2
        if (j > 0 && arr2[j] == arr2[j - 1]) {
            j++;
            continue;
        }

        if (arr1[i] < arr2[j]) {
            unionList.add(arr1[i]);
            i++;
        } else if (arr2[j] < arr1[i]) {
            unionList.add(arr2[j]);
            j++;
        } else {
            // Elements are equal, add one and move both pointers
            unionList.add(arr1[i]);
            i++;
            j++;
        }
    }

    // Add remaining elements of arr1 (skipping duplicates) whichever is longer
    while (i < n) {
        if (i > 0 && arr1[i] != arr1[i - 1]) //i>0 to eliminate NPE
        {
            unionList.add(arr1[i]);
        }
        i++;
    }

    // Add remaining elements of arr2 (skipping duplicates)
    while (j < m) {
        if (j > 0 && arr2[j] != arr2[j - 1])//j>0 to eliminate NPE
        {
            unionList.add(arr2[j]);
        }
        j++;
    }

    for(int element:unionList)
    {
    	System.out.println("Element "+element);
    }
    }
	}

