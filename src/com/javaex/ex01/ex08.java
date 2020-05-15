package com.javaex.ex01;

public class ex08 {

	public static void main(String[] args) {
		// 대입연산자
		int a=7;
		int b=2;
		
		// 산술연산자
		System.out.println("산술연산자");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		
		// 부호연산자
		System.out.println("부호연산자");
		int var=-3;
		int pvar=+var;
		int mvar=-var;
		
		System.out.println(pvar);
		System.out.println(mvar);
		
		// 증강연산자
		System.out.println("증강연산자");
		System.out.println(a);
		System.out.println(++a);
		System.out.println(b);
		System.out.println(--b);
		System.out.println(a++);
		System.out.println(a);
	}

}
