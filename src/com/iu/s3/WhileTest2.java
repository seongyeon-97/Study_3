package com.iu.s3;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		System.out.println("----While Test2 start----");
		
		int id = 1234;
		int pw = 5678;
		int mid = 0;
		int mpw = 0;
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		
		
		
		while(check) {
			System.out.println("1. 로그인 , 2. 종료");
			int select = sc.nextInt();
			if(select==1) {
				System.out.println("ID : ");
				mid = sc.nextInt();
				System.out.println("PW : ");
				mpw = sc.nextInt();
					if(id==mid && pw==mpw) {
						check=!check;
						System.out.println("로그인 되었습니다.");
				}else {
					System.out.println("ID와 PW를 다시 한번 확인해주세요.");
				}				
			}else {
				check=!check;
				System.out.println("-----종료-----");
			}
		}
		
		
		System.out.println("----While Test2 finish----");
		

	}
}
