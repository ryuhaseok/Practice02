package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		
		String alpa = sc.nextLine();
		
		switch (alpa) {
		
		case "a":
		case "e": 
		case "i":
		case "o":
		case "u":
		case "y":
		case "w":
			System.out.println("모음입니다.");
			break;
			
		default :
			System.out.println("자음입니다.");
			
		}
		
		sc.close();
		
		
	}

}
