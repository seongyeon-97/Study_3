package com.iu.s1;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("Test5 start");		
		Scanner sc = new Scanner(System.in);
		
		//회원가입 시 입력한 id
		int id = 1234;
		
		//회원가입 시 입력한 pw
		int pw = 5678;
		
		System.out.println("ID를 입력하세요 : ");
		//id 입력 후 저장
		int i = sc.nextInt();
		System.out.println("pw를 입력하세요 : ");
		int p = sc.nextInt();
		
		if(id==i && pw==p) {
			System.out.println("로그인 성공!!");
		}
		
		System.out.println("다시 확인해주세요");
		System.out.println("Test5 finish");
		
	}
}
