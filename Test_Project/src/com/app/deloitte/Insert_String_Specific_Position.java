package com.app.deloitte;

/**
 * 
 * 9.write a java program to insert given string at specific position in another string
 * 
 * input
 * Name Java Developer
 * postion 4
 * 
 * output
 * Name : Mahindra
 * Designation : Java Devloper
 * 
 */


public class Insert_String_Specific_Position {

	
	public static void main(String[] args) {
		
		String str="Name Java Devloper";
		String position=" : Mahindra\nDesignation :";
		
		String result="";
		
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			
			if(i== 4) {
				result+=position+ch[i];
			}else {
				result+=ch[i];
			}
		}
		System.out.println(result);
	}
	
	
}
