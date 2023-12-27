package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		System.out.println("두번째 숫자: ");
		
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		
		if (no1>no2) {
			System.out.println("목: " + no1/no2);
			System.out.println("나머지: " + no1%no2);
			
		} else {
			System.out.println("목: " + no2/no1);
			System.out.println("나머지: " + no2%no1);
			
		}
		
		sc.close();
		
	}

}
