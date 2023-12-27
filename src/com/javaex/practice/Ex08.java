package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.println("키:   ");
		System.out.println("몸무게:  ");
		
		int height = sc.nextInt();
		int weight = sc.nextInt();
		
		if ( weight > (height-100)*0.9 ) {
			System.out.println("과체중 입니다.");
			System.out.println("표준체중: " + (height-100)*0.9 );
			
		} else if ( weight < (height-100)*0.9 ) {
			System.out.println("저체중 입니다.");
			System.out.println("표준체중: " + (height-100)*0.9 );
			
		} else {
			System.out.println("표준 입니다.");
			System.out.println("표준체중: " + (height-100)*0.9 );
			
		}
		
		sc.close();
		
	}

}
