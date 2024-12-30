package com.cookie.day2n.enumex;

public class Exam_Enum3 {
	public static void main(String[] args) {
		Season spring = Season.SPRING;
		//열거형 상수의 이름과 한글 이름 출력
		System.out.println(spring);
		System.out.println(spring.getSeason());
		for(Season season : Season.values()) {
			System.out.println("오늘의 계절 : "+ season+", "+season.getSeason());
		}
	}
}
