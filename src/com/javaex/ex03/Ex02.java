package com.javaex.ex03;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int money;
		
		System.out.print("근무 시간: ");
		int time = sc.nextInt();
		if(time<=8) {
			money = time*10000;
		}
		else{
			money = time*10000+(time-8)*5000;
		}
		System.out.println("임금은 "+ money + "원 입니다.");
		sc.close();
	}

}
