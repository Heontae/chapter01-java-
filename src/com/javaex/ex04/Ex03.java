package com.javaex.ex04;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<21; i++) {
			if(i%2==0 || i%3==0){
				continue;
			}
			System.out.println(i);
		}
	}

}
