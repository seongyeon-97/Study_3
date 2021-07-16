package com.iu.s4;

public class Array_6 {
	public static void main(String[] args) {
		int [] ar1 = {3,5,1,7,4};

		
		for(int j=0; j<ar1.length-1;j++) {
		for(int i=j+1; i<ar1.length; i++) {
			if(ar1[j]<ar1[i]) {
				int tmp = ar1[i];
				ar1[i] = ar1[j];
				ar1[j] = tmp;
			}
			
		}System.out.println(ar1[j]);
	}
		
}
}
