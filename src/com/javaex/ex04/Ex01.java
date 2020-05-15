package com.javaex.ex04;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.print("몇까지의 합을 구하시겠습니까?");
		int max=sc.nextInt();
		
		for(int i=1; i<=max; i++) {
			sum += i;
			System.out.println(i +"까지의 합은 "+sum );
			}
		System.out.println("1부터"+max+" 까지의 합은 "+sum+"입니다.");
		
	}

}
