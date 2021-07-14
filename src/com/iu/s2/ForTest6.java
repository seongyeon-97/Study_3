package com.iu.s2;

import java.util.Scanner;

public class ForTest6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw = 5678;
		int di = 0;
		int wp = 0;
		
		boolean flag = false;
		
		for(int i =0; i<5; i++) {			
			
			System.out.println("아이디 입력 :");
			di = sc.nextInt();
			System.out.println("비밀번호 입력 :");
			wp = sc.nextInt();
			
			if(id==di && pw==wp) {				
				flag = !flag;
				break;
			}
			
		}//for문의 끝
		
		if(flag == true) {
			System.out.println("--로그인 되었습니다--");
			}
			else {
			System.out.println("5회 로그인 실패로 은행 방문이 필요합니다.");
			}
		
//		if(id==di && pw==wp) {
//		System.out.println("--로그인 되었습니다--");
//		}
//		else {
//		System.out.println("5회 로그인 실패로 은행 방문이 필요합니다.");
//		}
		
		System.out.println("----ForTest6 finish----");
	}
	
}
