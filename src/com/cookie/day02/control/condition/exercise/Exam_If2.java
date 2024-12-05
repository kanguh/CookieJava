package com.cookie.day02.control.condition.exercise;

import java.util.Scanner;

public class Exam_If2 {
	public static void main(String [] args) {
		/*
		 * 문제2
		 * 커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오
		 * 주문하시겠어요? 가격을 알려드립니다.
		 * (에스프레소, 카푸치노, 카페라떼, 아메리카노)
		 * 메뉴를 입력해주세요 : 에스프레소
		 * 2500원입니다.
		 * 메뉴를 입력해주세요 : 자바칩프라프치노
		 * 없는 메뉴입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 입력 : ");
		String menu = sc.next();
		if (menu.equals( "에스프레소")){
				System.out.println("2500원");
		}else if (menu.equals("아메리카노")) {
			System.out.println("3500원");
		}else if (menu.equals( "카푸치노")) {
			System.out.println("5000원");
		}else if (menu.equals( "카페라테")) {
			System.out.println("5500원");
		}else {
			System.out.println("없는 메뉴입니다.");
		}
	}
}
