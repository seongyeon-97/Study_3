package com.iu.s4;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
				
		int [] numbers = new int[3];
		//numbers의 데이터 타입은 int [] (o), int (x)
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		
		double [] num = new double[4];
		num[0] = 3.12;
		num[1] = 2.3;
		num[2] = 4.123;
		
		
		System.out.println(numbers[2]);
		System.out.println("배열의 크기 : "+numbers.length);
		
		System.out.println(num[1]);
		System.out.println(num[3]); // 초기값 0.0
		//System.out.println(num[4]); // 에러 0~3까지기 때문에 4번 index는 없음
		
		// 범위가 벗어나면 나오는 에러문구
		// java.lang.ArrayIndexOutOfBoundsException
		
		// 문자열을 담을 배열 3칸 짜리 생성 후 
		// 모두 출력
		
		String [] name = new String[3];
		System.out.println(name[0]);
		
		Scanner [] sc = new Scanner[2];
		System.out.println(sc[0]);
		System.out.println(sc[1]);
		
		
	}

}
