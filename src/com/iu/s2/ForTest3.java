package com.iu.s2;

import java.util.Scanner;

public class ForTest3 {
	public static void main(String[] args) {
		System.out.println("----ForTest3 start----");
		
		System.out.print("시간을 입력해주세요 :");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		
		for(int sec=0; sec<60; sec++) {
			System.out.println(sec+"초");
			if(sec == time) {
				sec = 60;
				//break;
			}
		}
		System.out.println("----ForTest3 finish----");
	}
}
