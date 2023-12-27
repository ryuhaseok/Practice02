package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		System.out.println("두번째 숫자: ");
		
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		
		if (no1>no2 && no1%no2 == 0) {
			System.out.println(no2 + " 는(은) " + no1 + " 의 약수입니다.");
			
		} else if (no1>no2 && no1%no2 != 0){
			System.out.println(no2 + " 는(은) " + no1 + " 의 약수가 아닙니다.");
			
		} else if (no1<no2 && no2%no1 == 0) {
			System.out.println(no1 + " 는(은) " + no2 + " 의 약수입니다.");
			
		} else {
			System.out.println(no1 + " 는(은) " + no2 + " 의 약수가 아닙니다.");
			
		}
		
		sc.close();
		
	}

}
