package com.iu.s1;

import java.util.Scanner;

public class Test10 {
	public static void main(String [] args) {
		
		int select = 0;
		System.out.print("입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		select = sc.nextInt();
		
		if(select==1) {
			System.out.println("입금");
		}else if(select==2) {
			System.out.println("출금");
		}else if(select==3) {
			System.out.println("이체");
		}else {
			System.out.println("조회");
		}
		
	}
}
