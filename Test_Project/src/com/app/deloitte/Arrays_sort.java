package com.app.deloitte;

import java.util.Arrays;

/**
 * 6. write a java program to read below array values, and re arrange array elemtnts as zero should come first and 1 should come last
 *
 * input array
 *  {0,1,1,0,1,0,0,1,1,0}
 * 
 * output array
 * {0,0,0,0,1,1,1,1,1}
 * 
 */
public class Arrays_sort {

	public static void main(String[] args) {

		int[] arr={0,1,1,0,1,0,0,1,1,0};
		System.out.print("[");
		int i=1;
		for(int a:arr) {
			System.out.print(a);
			if(arr.length != i) {
				System.out.print(", ");
			}
			i++;
		}
		System.out.println("]");
		Arrays.sort(arr);
		System.out.print("[");
		int n=1;
		for(int a:arr) {
			System.out.print(a);
			if(arr.length != n) {
				System.out.print(", ");
			}
			n++;
		}
		System.out.print("]");
	}
}
