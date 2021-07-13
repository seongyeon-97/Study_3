package com.iu.s1;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		System.out.println("----Test13 start----");
		
		System.out.println("요금조회는 1번, 상품가입은 2번, 고장신고는 3번, 상담원연결은 0번을 눌러주세요~!");
		
		//요금조회는 1번 상품가입은 2번 고장신고 3번 상담원연결 0번
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int select = 0;
		switch(num) {
			case 1: 
				System.out.println("요금조회");
				break;
				
			case 2: 
				System.out.println("상품가입");
				break;
				
			case 3: 
				System.out.println("고장신고");
				break;
				
			case 0: 
				System.out.println("상담원연결");
				break;
				
			default :
				System.out.println("잘못 누르셨습니다.");
		}
		
//		if(select>0) {
//			int num2=20;
//		}
//		System.out.println(num2);
		
		System.out.println("----Test13 finish----");
	}
}
