package com.iu.s3;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		
//		for(int i=0; i<5; i++) {
//			System.out.println(i);
//		}
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종    료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("회원가입 코드 진행");
				break;
			case 2:
				System.out.println("로그인 코드 진행");
				break;
			default:
				System.out.println("-----종료-----");
				check = !check;
			}
			
			
//			if(select==1) {
//				System.out.println("회원가입 코드 진행");
//			}else if(select==2) {
//				System.out.println("로그인 코드 진행");					
//			}else {
//				check = !check;
//				System.out.println("-----종료-----");		
//			}
			
			
		}
	}

}
