package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.println("기호:   ");
		System.out.println("숫자1:    ");
		System.out.println("숫자2:    ");
		
		String tool = sc.nextLine();
		double no1 = sc.nextDouble();
		double no2 = sc.nextDouble();
		
		// 안됨.
		/*
		if (tool=="+") {
			System.out.println("결과는: " + (no1+no2) );
						
		} else if (tool=="-") {
			System.out.println("결과는: " + (no1-no2) );
			
		} else if (tool=="*") {
			System.out.println("결과는: " + (no1*no2) );
			
		} else if (tool=="/") {
			System.out.println("결과는: " + (no1/no2) );
			
		} else if (tool=="/" && no2 == 0) {
			System.out.println("계산할 수 없습니다.");
			
		} else {
			System.out.println("계산할 수 없는 기호입니다.");
			
		}
		*/
		sc.close();
		
	}

}
