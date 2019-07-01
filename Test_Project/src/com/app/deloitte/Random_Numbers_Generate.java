package com.app.deloitte;

import java.util.Random;

/**
 * 11.write a program to generate random aplhanumeric string with given of characters
 * 
 * output jG8b7
 *
 */
public class Random_Numbers_Generate {

	public static void main(String[] args) {
		
		String str="abcdefghijklmnopqrstuvwxyz1234567890";
		char[] ch=str.toCharArray();
		Random random=new Random();
		
		for(int i=1;i<=5;i++) {
			System.out.print(ch[random.nextInt(35)]);
			
		}
		
		//UUID str=UUID.randomUUID();
	}
}
