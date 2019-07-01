package com.app.office;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesElementsInArray {

	
	public static void main(String[] args) {
		int[] arr= {1,2,4,2,3,5,6,5,8,3,9,1};

		System.out.println("Array Print");
		
		
		Set<Integer> set=new LinkedHashSet<Integer>();
		List<Integer> dup=new ArrayList<Integer>();
		List<Integer> arrlst=new ArrayList<Integer>();
		for(int i:arr) {
			
			arrlst.add(i);
			if(set.contains(i)){
				dup.add(i);
			}else {
				set.add(i);
			}
		}
		
		System.out.println(arrlst);
		
		System.out.println("\nWith out Duplicate Array Print");
		System.out.println(set);
		
		System.out.println("With Duplicate Array Print");
		System.out.println(dup);

		

	}
	
	
	
}
