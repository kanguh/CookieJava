package com.cookie.day02.control.condition.exercise;

import java.util.Scanner;

public class Exam_Switch1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 입력 : ");
		String menu =sc.next();
		int price = 0;
		switch(menu) {
			case "에스프레소": 
				price = 2500;
				break;
			case "아메리카노":
				price = 1500;
				break;
			case "카페라떼":
				price = 3500;
				break;
			case "카푸치노":
				price = 4500;
				break;
			default: 
				System.out.println("없는 메뉴입니다");
		}
		if (price != 0) {
		System.out.println(price+"원입니다.");
		}
	}
}
