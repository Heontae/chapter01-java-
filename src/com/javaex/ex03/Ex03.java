package com.javaex.ex03;
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		
		int num = sc.nextInt();
		if(num%3==0 && num!=0) {
			System.out.println(num+"은(는) 3의 배수입니다.");
		}
		sc.close();
	}

}
