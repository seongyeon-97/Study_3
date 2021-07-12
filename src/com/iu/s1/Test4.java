package com.iu.s1;

import java.util.Scanner;

public class Test4 {
	public static void main(String [] args) {
		
		
		System.out.println("Test4 Start");
		System.out.println("--------------");	
		
		Scanner sc = new Scanner(System.in);
		int age = 0;
		
		age = sc.nextInt();
		
/*		if(10<age) {
			if(age<20) {
				System.out.println("10대 입니다!");
			}
	} */
		
		if(age>=10 && age<20) {
			System.out.println("10대입니다!");
		}
		
		System.out.println("--------------");	
		System.out.println("Test4 Finish");
	
	}
}
