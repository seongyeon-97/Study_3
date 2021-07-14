package com.iu.s2;

import java.util.Scanner;

public class ForTest5 {
	public static void main(String[] args) {
		System.out.println("----ForTest5 start----");
		
		
		//과목수는 미정
		System.out.print("과목수를 입력해 주세요 : ");		
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();

		double avg = 0;
		int point = 0;
		int gemsu = 0;
		
		for(int i=1; i<=su; i++) {
			System.out.print(i+"번째점수입력 : ");
			point = sc.nextInt();
			gemsu = gemsu +point;
			avg = gemsu/(double)su;
			if(i==su) {
				System.out.println("총 합 : "+gemsu);
				System.out.println("평균 : "+avg);				
				break;
			}
		}
		
		
		System.out.println("----ForTest5 finish----");
	}
}
