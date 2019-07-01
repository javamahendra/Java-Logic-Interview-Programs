package com.app.deloitte;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 12. write a java program to read a string then print occurance of each vowel in given string
 *
 * input string Java Developer
 * 
 * output
 * a-2
 * e-3
 * o-1	
 */

public class String_Vowels_Count {
	
	public static void main(String[] args) {
		
		String str="Java Developer";
		
		char[] ch=str.toCharArray();
		List<Character> vowels=Arrays.asList('a','e','i','o','u');
		
		Map<Character, Integer> map=new LinkedHashMap<>();
		
		for(char ch1:ch) {
			if(vowels.contains(ch1)) {
				
				if(map.containsKey(ch1))
					map.put(ch1, map.get(ch1)+1);
				else
					map.put(ch1, 1);
			}	
		}
		
		map.forEach((k,v)->{
			System.out.println(k+"-"+v);			
		});
		
		
		
		
		
		
		
		
		
	}

}
