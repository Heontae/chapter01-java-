package com.javaex.ex01;

public class ex05 {

	public static void main(String[] args) {
		//보통의경우
		double pi = 3.14;
		double result01=5*5*pi;
		System.out.println(result01);
		
		pi=3.1415;	//변수는 값을 변경 가능
		double result02=5*5*pi;
		System.out.println(result02);
		
		final double pi2 = 3.14; //final 써주면 밑에서 변수값 변경 불가.
		double result03 = 5*5*pi2;
		System.out.println(result03);
		
		/*double pi2 = 3.1415;	위에서 final 써줘서 값을 변경할수 없다-->상수*/
		
		int i = 2;
		System.out.println(i*3.14);
		
	}

}
