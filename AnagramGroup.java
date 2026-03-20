package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs= {"cat","hat","act","tac"};
		List<List<String>> listanagrams=groupAnagrams(strs);
		/*
		 * for(List<String> str:listanagrams) { for(String s: str) {
		 * System.out.println("Element "+s); } }
		 */

	}
	 private static List<List<String>> groupAnagrams(String[] strs) {
	        Map<String,List<String>> map=new HashMap<>();
	        for(int i=0;i<strs.length;i++)
	        {
	            char[] a=strs[i].toCharArray();
	            Arrays.sort(a);
	            String b=String.valueOf(a);
	            if (!map.containsKey(b)) {
	                map.put(b, new ArrayList<>());
	            }
	            map.get(b).add(strs[i]);
	        }
	        return new ArrayList<>(map.values());
	    }
}
