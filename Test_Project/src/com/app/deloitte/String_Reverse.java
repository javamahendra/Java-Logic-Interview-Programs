package com.app.deloitte;


/**
 * 8. write a java program to read String, and reverse string don't use pre-defined method
 * 
 * input
 * java language
 * 
 * avaj egaugnal
 */


public class String_Reverse {

	public static void main(String[] args) {
		
		String str="java language";
		
		String[] strArr=str.split(" ");
		
		for(String s:strArr) {
			
			char[] ch=s.toCharArray();
			
			for(int i=ch.length-1;i>=0;i--) {
				
				System.out.print(ch[i]);
			}
			System.out.print(" ");
		}
	}	
}
