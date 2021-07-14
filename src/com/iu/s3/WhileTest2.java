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
		//로그인 성공 시 게임 시작, 로그인 실패면 게임 시작x
		//rpg게임
		//최초 레벨은 1 만랩 15 -> 게임 종료
		//최초 gold는 0
		//레벨 5 달성시 1000gold 지급
		//레벌 10 달성시 2000gold, 15 달성시 3000gold
		//레벨업 하려면 사냥 필요 모든 몬스터의 경험치는 동일
		//1->2 3마리 2->3 6마리 3->4 9마리
		//레벌업 이모트 몬스터 1마리 사냥*3
		//최종레벨, 최종골드 출력
		int level=0;
		int gold=0;
		int hunt=0;
		
		if(id==mid && pw==mpw) {
			
			System.out.println("스카니아 1서버 접속 완료");
			
			for(level=1; level<16; level++) {
				
				System.out.println("="+level+"Level=");
				
				for(hunt=1; hunt<=level*3; hunt++) {
					System.out.println("몬스터"+hunt+"마리 사냥");
				}
				
				if(level%5==0) {
					gold=gold+1000;
					System.out.println(gold+"GOLD 획득");
				}
				
				System.out.println("Level up");				
				
				if(level==15) {
					System.out.println("만랩 달성하셨습니다!!!! 축하드립니다!!!");
					System.out.println("최종 Level : "+level);
					System.out.println("최종 Gold : "+gold);
					System.out.println("=========Ending=========");
				}
			}
		}
		
		System.out.println("----While Test2 finish----");
		
	}
}


