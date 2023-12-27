package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		
		String alpa = sc.nextLine();
		
		
		//왜 안돼
		/*
		if (alpa == "a") {
			System.out.println("모음입니다.");
			
		} else if (alpa == "e") {
			System.out.println("모음입니다.");
			
		} else if (alpa == "u") {
			System.out.println("모음입니다.");
			
		} else if (alpa == "i") {
			System.out.println("모음입니다.");
			
		} else if (alpa == "o") {
			System.out.println("모음입니다.");
			
		} else if (alpa == "w") {
			System.out.println("모음입니다.");
			
		} else if (alpa == "y") {
			System.out.println("모음입니다.");
			
		} else {
			System.out.println("자음입니다.");
			
		}
		*/
		sc.close();
		
	}

}
