package com.app.deloitte;

/**
 * 3. write a program to replace first half of the string with second half
 * 
 * Note:- if String length is odd ,keep middle character as it is and replace first half of the string with second half
 * input  sweet-house
 * output house-sweet
 * 
 * input  sweethouse
 * output housesweet
 */
public class Replace_FirstHalf_And_SecondHalf {
	
	public static void main(String[] args) {
		String str="sweethouse";
		
		char[] ch=str.toCharArray();
		
		int n=str.length();
		int fh=n/2;
		
		int sh=n-n/2;
		
		String result="";
		for(int i=sh;i<=str.length()-1;i++) {
			
			result+=ch[i];
		}
		int pos=sh-fh;
		if(pos==1) {
			result+=ch[sh-1];
		}
		for(int i=0;i<=fh-1;i++) {
			
			result+=ch[i];
		}
		
		
		System.out.println(result);
	}
}
