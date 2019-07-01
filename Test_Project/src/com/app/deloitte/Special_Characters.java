package com.app.deloitte;

/**
 * 
 * 10.write a program to move all special characters in string to end of the string
 * input 
 * java$#&-deve$#%&loper#$%
 * 
 * output 
 * java-developer$#&$#%&#$%
 *
 */

public class Special_Characters {

	public static void main(String[] args) {
		
				
		String str="java$#&-deve$#%&loper#$%";
		String str1="";
		String str2="";

		char[] ch=str.toCharArray();
		
		for(char ch1:ch) {
			
			if(ch1 == 35 || ch1 == 36 || ch1 == 37 || ch1 == 38) {
				str2+=ch1+"";
			}else {
				str1+=ch1+"";
			}
		}
		
		System.out.println(str1+str2);
		
	}
}
