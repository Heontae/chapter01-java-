package com.javaex.ex04;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
//		while(true) {
//			if(num%6==0 && num%14==0 && num!=0) {
//				System.out.println(num);
//				break;
//			}
//			num++;
//		}
		for(int i=0; i<200; i++) {
			if(i%6==0 && i%14==0 && i!=0) {
				System.out.println(i);
			}
		}
	}

}
