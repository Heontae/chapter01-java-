package com.javaex.ex01;

public class ex10 {

	public static void main(String[] args) {
		//논리 연산자
		int  a= 5;
		int b = 7;
		
		//논리 연산자 &&(AND,그리고) 둘다 true값일떄 true
		System.out.println("&&연산자");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		//논리 연산자 ||(Or,또는)	둘중 하나라도 true값일때 true
		System.out.println("||연산자");
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		//응용
		System.out.println((a>b)&&(a<b)); 
		

		System.out.println((a>b)||(a<b)); 
	}

}
