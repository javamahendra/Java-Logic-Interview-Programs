package com.app.deloitte;

import java.util.Arrays;

/**
 * 5. write a java program to find min and max elements in array 
 *
 * input array
 * arr1 {1,3,5,7,9,2,4,6,8,9}
 * 
 * min-1 and max-9
 * 
 */
public class Arrays_Min_Max_Element {

	public static void main(String[] args) {
		int[] arr= {1,3,5,7,9,2,4,6,8,9};
		
		Arrays.sort(arr);
		
		System.out.println("Min-"+arr[0]+" and Max-"+arr[arr.length-1]);
	}
}
