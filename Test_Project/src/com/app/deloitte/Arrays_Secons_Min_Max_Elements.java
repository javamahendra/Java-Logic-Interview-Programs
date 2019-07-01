package com.app.deloitte;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 15. write a java program to find second min and max elements in array 
 *
 * input array
 * arr1 {1,3,5,7,9,2,4,6,8,9}
 * 
 * min-2 and max-8
 * 
 */

public class Arrays_Secons_Min_Max_Elements {
	
	public static void main(String[] args) {
		int[] arr= {1,3,5,7,9,2,4,6,8,9};
		
		Arrays.sort(arr);
		
		Set<Integer> set=new LinkedHashSet<Integer>();
		for(int a:arr)
			set.add(a);
		
		Object[] arr1= set.toArray();
		
		System.out.println("Min-"+arr1[1]+" and Max-"+arr1[arr1.length-2]);
	}
}
