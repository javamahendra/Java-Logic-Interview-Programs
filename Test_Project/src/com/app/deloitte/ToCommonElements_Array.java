package com.app.deloitte;

import java.util.ArrayList;
import java.util.List;

/**
 * 13.write a java program to find common elements of arrays 
 *
 * input two arrays
 * arr1 {1,3,4,5,6} 
 * arr2 {2,3,4,5,9}
 * 
 * output 3 4 5
 *	
 */

public class ToCommonElements_Array {

	public static void main(String[] args) {
		
		int[] arr1= {1,3,4,5,6};
		int[] arr2= {2,3,4,5,9};
		
		List<Integer> lst=new ArrayList<Integer>();
		
		
		for(int arr: arr1) {
			lst.add(arr);
		}
		for(int arr:arr2) {
			
			if(lst.contains(arr)) {
				System.out.println(arr);
			}
		}
		
		
		
		

	}
}
