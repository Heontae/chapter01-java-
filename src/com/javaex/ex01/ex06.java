package com.javaex.ex01;

public class ex06 {

	public static void main(String[] args) {
		float result00 = 2+3.5f;
		System.out.println(result00);
		
		long var00 = 12345l;
		float var01 = 1.1f;
		float result01 = var00+var01; 
		System.out.println(result01);
		
		//강제 형변화
		
		int i = (int)112.532424;
		System.out.println(i);
		
		//확대변환
		byte v01 =10;
		int v02 = (int)v01;
		System.out.println(v02);
		
		//축소변환
		int v03 =10;
		byte v04 = (byte)v03;
		System.out.println(v04);
		
		//축소변환 비정상적인경우
		int v05 = 153029770;
		byte v06 = (byte)v05;
		System.out.println(v06);
		
		//실수-->정수 : 소수점 아래 삭제(의도해서 사용할 수 있음)
		double v07=5.57;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//정수-->실수
		int v09=7;
		double v10=(double)v09;
		System.out.println(v10);
	}

}
