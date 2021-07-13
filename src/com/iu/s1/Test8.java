package com.iu.s1;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		
		System.out.println("Test8 start");
		System.out.println("--------------");
		
		Scanner sc = new Scanner(System.in);
		int kor;
		System.out.print("국어 : ");
		kor = sc.nextInt();
		
		int eng;
		System.out.print("영어 : ");
		eng = sc.nextInt();
		
		int math;
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		double avg = (kor+eng+math)/3;
		System.out.println("평균 : "+avg);
		
		//합격기준 : 평균이 60점 이상 과목당 40점 이상
/*		if(avg>=60) {
			if(kor>=40) {
				if(eng>=40) {
					if(math>=40) {
				}
					else {
						System.out.println("국어 과락입니다..");
					}
			}	else {
					System.out.println("국어 과락입니다..");
			}
		}	else {
				System.out.println("국어 과락입니다..");
		}
*/		
// ----------------------------------------------------------------
		
/*		if(avg>=60 && kor>=40 && eng>=40 && math>=40) {
			System.out.println("합격입니다!! 축하드립니다~~!!");
		}
		else {
			System.out.println("안타깝지만 불합격입니다....");
		}
*/		
		if(avg>=60) {
			if(kor>40 && eng>40 && math>40) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}else {
			System.out.println("불합격");
		}
		
		
		System.out.println("--------------");
		System.out.println("Test8 finish");
	}
}

