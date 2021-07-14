package com.iu.s2;

import java.util.Scanner;

public class ForTest8 {
	public static void main(String[] args) {
		System.out.println("----ForTest8 start----");
		
		//분 초 출력
		//분 초를 입력 받아 0 0부터 시작해 입력한 분초까지 찍고 종료
		int min = 0;
		int sec = 0;
		boolean flag = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분 :");
		int m = sc.nextInt();
		
		System.out.println("초 :");		
		int s = sc.nextInt();
		
		for(min=0; min<60; min++) {
			for(sec=0; sec<60; sec++) {
				System.out.println(min+"분 "+sec+"초");
					if(m==min && s==sec) {
						System.out.println("--종료--");
						flag = true;
						min=60;
						break;	
				}											
			}//안쪽 for 종료
//			if(flag==true) {
//				break;
//			}//바깥쪽 for 종료
		}		
		
		System.out.println("----ForTest8 finish----");
	}
}
