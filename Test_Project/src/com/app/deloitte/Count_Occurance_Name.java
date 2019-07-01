package com.app.deloitte;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 1. write a java program to identify max occurance name given list
 *
 * input list
 * ramu ,raju, rama, sita ,gita ,sita, ,rama, mahi
 * 
 * output
 * rama-2
 * sita-2
 * 
 * if multiple names having same count, print the name which occurs last in alphabitical order
 * 
 * sita-2	
 */

public class Count_Occurance_Name {
	
	public static void main(String[] args) {
		
		List<String> lst=Arrays.asList("ramu","raju","rama","sita","gita","sita","rama","mahi");
		
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		
		for(String str:lst) {
			
			if(map.containsKey(str)) {
				map.put(str,map.get(str)+1);
			}else {
				map.put(str,1);
			}
		}
		
		
		map.forEach((k,v)->{	
			if(map.get(k)>=2) {
				
				
				
				
				
				System.out.println(k +"-"+ v);
			}
		});
	}
}
