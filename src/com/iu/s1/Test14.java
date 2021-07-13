package com.iu.s1;

import java.util.Scanner;

public class Test14 {
	public static void main(String[] args) {
		System.out.println("----Test14 start----");
		
		System.out.print("평균점수 : ");
		Scanner sc = new Scanner(System.in);
		int avg = sc.nextInt();
		
		switch(avg/10) {
			case 10 : 
				System.out.println("A");
			case 9 : 
				System.out.println("A");
				break;	
			case 8 : 
				System.out.println("B");
				break;
			case 7 : 
				System.out.println("C");
				break;				
			case 6 : 
				System.out.println("D");
				break;
				
		}
		
		
		
		System.out.println("----Test14 finfish----");
	}
}
