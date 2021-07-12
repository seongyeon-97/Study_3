package com.iu.s1;

import java.util.Scanner;

public class Test3 {
	public static void main(String [] args) {
		
		System.out.println("Test3 Start");
		System.out.println("--------------");		

		Scanner sc = new Scanner(System.in);
		int price = 0;
		price = sc.nextInt();
		
		if(price<=30000) {
			price = price + 3000;
			System.out.println("주문금액 : "+price+"원");
		}
		
		System.out.println("주문금액 : "+price+"원");
		System.out.println("--------------");
		System.out.println("Test3 Finish");
	}
}
