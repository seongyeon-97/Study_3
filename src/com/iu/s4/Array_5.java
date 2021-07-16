package com.iu.s4;

import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) {
		System.out.println("-----Array_5 start-----");
		//1. 정보출력
		//2. 정보추가
		//3. 정보삭제
		//4. 종  료
		
		//1,2,3,4, 중 하나 입력 받기
		//4번 누르면 그 때 모두 종료
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int [] ar1 = {12, 13, 14};
		

		int i =0;
		while(check) {
			System.out.println("1. 정보출력");
			System.out.println("2. 정보추가");
			System.out.println("3. 정보삭제");
			System.out.println("4. 검색 후 삭제");			
			System.out.println("5. 종   료");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:			
				for(i=0; i<ar1.length; i++) {
					System.out.println(ar1[i]);
					}
				break;
				
			case 2:
				System.out.println("추가할 데이터를 입력해주세요");				
				int num = sc.nextInt();
				int [] ar2 = new int [ar1.length+1];
				
				for(i=0; i<ar1.length; i++) {
					ar2[i]=ar1[i];
					}
				
				ar2[ar1.length]=num;				
				ar1=ar2;				
				break;
				
			case 3:
				System.out.println("정보를 삭제하겠습니다");
				
				if(ar1.length!=0) {			
					int [] ar3 = new int [ar1.length-1];
					for(i=0; i<ar3.length; i++) {
					ar3[i]=ar1[i];					
					}
				
					ar1=ar3;
				
					for(i=0; i<ar1.length; i++) {
						System.out.println(ar1[i]);
						}
				}else if(ar1.length==0) {
						System.out.println("더이상 출력할게 없습니다");
					}
				break;
				
			case 4:
				if(ar1.length==0) {
					System.out.println("data가 없어요");
					continue;
				}
				
				System.out.println("삭제할 인덱스 번호 입력");
				int a= sc.nextInt();
				
				if(a>=ar1.length || a<0) {
					System.out.println("범위를 벗어났습니다");
					continue;
				}
				
				int [] ar4 = new int [ar1.length-1];
				int index=0; //ar4와 ar1의 인덱스번호를 다른 변수로 설정해줘야 복사 가능
				//끝까지 돌아야 다 가져올 수 있음
				for(i=0; i<ar1.length; i++) {				
					if(a==i) {
						continue;
					}
	
					ar4[index]=ar1[i];		
					index++;
					}
				
				ar1=ar4;
				
				for(i=0; i<ar1.length; i++) {
					System.out.println(ar1[i]);
					}
				
				break;
				
			default:
				System.out.println("프로그램을 종료하겠습니다");
				check=!check;
			
			}			
		}
		System.out.println("-----Array_5 finish-----");
	}

}
