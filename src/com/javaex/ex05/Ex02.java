package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		// arrA값을 arrB값에 복사하는 코드
		int arrA[] = { 3, 6, 9 };
		int arrB[] = new int[3];

		for (int i = 0; i < arrA.length; i++) {
			arrB[i] = arrA[i];
		}
		arrA[1] = 10;
		for (int i = 0; i < arrA.length; i++) {
			System.out.println("===============");
			if (arrA[i] == arrB[i]) {
				System.out.println("arrA[" + i + "]는" + arrA[i]);
				System.out.println("arrB[" + i + "]는" + arrB[i]);
				System.out.println(i+"번째의 값이 같습니다.");
			} else {
				System.out.println("arrA[" + i + "]는" + arrA[i]);
				System.out.println("arrB[" + i + "]는" + arrB[i]);
				System.out.println(i+"번째의 값이 다릅니다.");
			}
		}

	}

}
