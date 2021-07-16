package com.iu.s4;

public class Array_7 {

	public static void main(String[] args) {
		
		//학생의 정보는 이름 번호 국어 영어 수학 총점 평균으로 이뤄짐
		//학생 수가 3명 : 
		
		String [] names = new String[3];
		names[0]="iu";
		names[1]="choa";
		names[2]="suji";
		
		int [] nums = new int[3];
		nums[0] = 5;
		nums[1] = 29;		
		nums[2] = 2;
		
		for(int idx=0; idx<nums.length-1; idx++) {
			for(int i=idx+1; i<nums.length; i++) {
				if(nums[idx]>nums[i]) {
					int tmp = nums[i];
					nums[i]=nums[idx];
					nums[idx]= tmp;
					
					//이름 자리 바꾸기
					String t = names[i];
					names[i]= names[idx];
					names[idx]= t;
				}
			}
		}//정렬시키는 for
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
			System.out.println(names[i]);
			
		}
				
		
		
		//이름하고 번호들을 출력, 번호 순서대로 출력
		
		int [] kors = new int[3]; 
		String name = "iu";
		int num = 1234;
		int kor = 20;
		int eng = 30;
		int math = 40;
		int total = kor+eng+math;
		double avg = total/3.0;
		
		
	}

}
