package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		
		String alpa = sc.nextLine();
		
		
		//문자열은 == 가 안통함. 참조자료형이라 주소를 비교하기 때문, 변수명.equals("")를 사용.
		
		if (alpa.equals("a")) {
			System.out.println("모음입니다.");
			
		} else if (alpa.equals("e")) {
			System.out.println("모음입니다.");
			
		} else if (alpa.equals("u")) {
			System.out.println("모음입니다.");
			
		} else if (alpa.equals("i")) {
			System.out.println("모음입니다.");
			
		} else if (alpa.equals("o")) {
			System.out.println("모음입니다.");
			
		} else if (alpa.equals("w")) {
			System.out.println("모음입니다.");
			
		} else if (alpa.equals("y")) {
			System.out.println("모음입니다.");
			
		} else {
			System.out.println("자음입니다.");
			
		}
		
		sc.close();
		
	}

}
