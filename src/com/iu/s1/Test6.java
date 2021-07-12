package com.iu.s1;

import java.util.Scanner;

public class Test6 {
	public static void main(String [] args) {
		System.out.println("Test6 start");
		
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
		
		String result = "불합격";
		
		if(avg>=60) {
			result = "합격";
		}
		
		System.out.println(result);
		
/*		String a = null;
		
		if(avg<60) {
			a = "불";
		}
	
		System.out.println(a+"합격입니다");
*/		
		
/*		if(avg>=60) {
			System.out.println("합격입니다~~!!");
		}
		else {
			System.out.println("불합격입니다.....");
		}
*/		
/*		int num = 5;		
		if(num%2 == 0) {
			System.out.println("짝수입니다!!");
		}
		else {
			System.out.println("홀수입니다!!");
		}
		
*/		
		System.out.println("Test6 finish");
		
	}
}
