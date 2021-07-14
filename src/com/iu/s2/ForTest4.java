package com.iu.s2;

public class ForTest4 {
	public static void main(String[] args ) {
		System.out.println("----ForTest4 start---- ");
		
		//1+2+3+4+5=15
		int hap=0;
		for(int i=0; i<=5; i++) { 
			hap = hap + i;
			System.out.println(hap);
		}
		System.out.println("총 합 : "+hap);
		System.out.println("----ForTest4 finish---- ");
	}
}
