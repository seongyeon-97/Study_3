package com.iu.s4;

import java.util.Scanner;

public class Array_8 {
	public static void main(String[] args) {
		
		int [] ids = {1234,4567,4359,1258};
		int [] pws = {6789,5432,1236,7646};
		
		//1. 로그인, 2. 회원가입, 3. 종  료
		
		System.out.println("1. 로그인"+"2. 회원가입"+"3. 종  료" );
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("아이디 입력 : ");
				int mids = sc.nextInt();
				System.out.println("비밀번호 입력 : ");
				int mpws = sc.nextInt();
				String point = "로그인 실패";
				
				for(int i=0; i<ids.length;i++) {
					if(mids==ids[i] && mpws==pws[i]) {
						point="로그인성공";
						break;				
						}					
					}
				
				System.out.println(point);		
				break;
				
			case 2:
				System.out.println("회원가입 페이지로 이동합니다.");
				
				boolean check = true;
				
				System.out.println("아이디 입력 : ");
				int mids2 = sc.nextInt();
				System.out.println("비밀번호 입력 : ");
				int mpws2 = sc.nextInt();
				
				int [] ids2 = new int[ids.length+1];
				int [] pws2 = new int[ids.length+1];
				
				
				for(int i=0; i<ids.length; i++) {					
					ids2[i]=ids[i];
					if(mids2==ids2[i]) {
						check=false;
						System.out.println("아이디가 중복되었습니다");
						break;
					}
				}
				
				if(check) {
					ids2[ids.length]=mids2;
					ids=ids2;
				
					for(int i=0; i<pws.length; i++) {
						pws2[i]=pws[i];
					}
				
					pws2[pws.length]=mpws2;
					pws=pws2;
				
					System.out.println("회원가입이 완료되었습니다.");
					
				}
				
				break;				
				
			default :
				System.out.println("-----종료-----");
				flag=!flag;
				
			
			}
		}
		
	}
}
