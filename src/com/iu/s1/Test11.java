package com.iu.s1;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		
		//국어 영어 수학을 입력받고 총점과 평균을 계산
		//평균이 90이상이면 A 출력
		//80이상으면 B, 70이상이면 C, 60점이상이면 D
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		System.out.println("총점 :"+total+" , "+"평균 : "+avg);
		
		if(avg>=90) {
			System.out.println("A");
		}else if(avg>=80) {
			System.out.println("B");
		}else if(avg>=70) {
			System.out.println("C");
		}else if(avg>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}
}
