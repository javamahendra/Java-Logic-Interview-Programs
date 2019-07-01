package com.app.deloitte;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 14. write a java program to perform union of 2 arrays 
 *
 * input two arrays
 * arr1 {1,3,5,7,9} 
 * arr2 {2,4,6,8,9}
 * 
 * output 
 *	{1,2,3,4,5,6,7,8,9}
 */

public class UnionOfArray {

	public static void main(String[] args) {
		
		int[] arr1={1,3,5,7,9};
		int[] arr2={2,4,6,8,9};
		
		Set<Integer> set=new LinkedHashSet<Integer>();

		for(int arr:arr1) {
			set.add(arr);
		}
		for(int arr:arr2) {
			set.add(arr);
		}
				
		Set<Integer> sortset=set.parallelStream().sorted().collect(Collectors.toSet());
		System.out.println(sortset);
	}
}
