package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[5];  //intArray에 5개짜리 배열 생성

		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 8;
		intArray[3] = 2;
		intArray[4] = 55;
		System.out.println(intArray.length);    //.length  배열 개수
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}

}
