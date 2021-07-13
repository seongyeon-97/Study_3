package com.iu.s2;

import java.util.Scanner;

public class ForTest1 {
	public static void main(String [] args) {
		System.out.println("----ForTest1 start----");

		Scanner sc = new Scanner(System.in);
//		System.out.println("반복할 횟수를 입력");
//		int count = sc.nextInt();
//		int num=0;
//		for(int i=0; i<count; i++) {
//			System.out.println("hi"+num);
//			num++;
//		}
		
		for(int i=0; i<20; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("-------------------------------------");
		
		for(int a=0; a<20; a=a+2) {
			System.out.println(a
					);
		}
		
		System.out.println("----ForTest1 finish----");
	}
}
