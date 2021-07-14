package com.iu.s2;

import java.util.Scanner;

public class ForTest9 {
	public static void main(String[] args) {
		System.out.println("---ForTest9 start----");
		
		Scanner sc = new Scanner(System.in);
		
		for(int tan=0; tan<3; tan++) {
			System.out.println("1. 단발"+" "+"2. 점사"+"  선택하시오.");
			int select = sc.nextInt();
			String sound = "탕";
			//int count = 30;
			int num=1;
			
			if(select!=1) {
				sound="타다당";
				num=3;
				//count = 10;
			}
			
			for(int i=0; i<30; i=i+num) {
				System.out.println(sound);
			}
		}
		System.out.println("---ForTest9 finish----");
	}
}





//		if(select==1) {
//			for(int i=0; i<=30; i++) {
//				System.out.println("탕!!!");
//			}			
//		} else{
//			for(int i=0; i<=10; i++) {
//				System.out.println("타다당!!!");
//			}
//		}