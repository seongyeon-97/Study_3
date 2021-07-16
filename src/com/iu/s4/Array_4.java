package com.iu.s4;

public class Array_4 {

	public static void main(String[] args) {
		
		//데이터타입 변수명;
		int [] ar1 = new int [3];
		ar1[0] = 1;
		ar1[1] = 2;
		ar1[2] = 3;		
		//4 추가
		
		int [] ar2 = new int [ar1.length+1];
			
		for(int i=0; i<ar1.length; i++) {
			ar2[i]=ar1[i];
		}
		//깊은 복사를 통해 ar2에 ar1값을 복사해준 후 마지막칸 내용 추가
		ar2[ar1.length]=4;
		
		ar1 = ar2;
		//주소값을 복사해주는 얕은 복사를 통해 주소값만 옮겨준다
		
		for(int i=0; i<ar1.length; i++) {
			System.out.println(ar1[i]);
		}
		
	}

}
