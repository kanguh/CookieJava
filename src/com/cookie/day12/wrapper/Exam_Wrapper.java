package com.cookie.day12.wrapper;

public class Exam_Wrapper {
	public static void main(String[] args) {
		int num =  10;
		num = 1118;
		Integer su = null;
//		su = new Integer(10);
		su = Integer.valueOf(502);  //--> 참조형 변수
		if(su != null) {
			su = 1225;			//오토박싱 (auto-boxing)
		}
		num = su.intValue(); // 원칙 int <= Integer
		num = su; // 오토 언박싱 (auto-unboxing)
		Double du = Double.valueOf(11.18);
		du = 5.02;
		double dNum = du.doubleValue();
		dNum = du;
		//Wrapper 클래스를 쓰는 이유
		// 1. Null체크가 가능해짐, int -> 0, double -> 0.0, String -> null ==>모두다 널로 체크 가능
		//2. 형변환 가능 String <-> int, String <-> boolean
		String openDate = "20241118";
		System.out.println(openDate + 2);
		int openDateNum = Integer.parseInt(openDate); // --->> **매우중요** parseInt
		System.out.println(openDateNum + 2);
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('a'));
		char c1 = '5', c2 = 'F';
		if(Character.isDigit(c1))
			System.out.println("숫자임");
		if(Character.isAlphabetic(c2))
			System.out.println("알파벳임");
		
		//==================== 문자열로 바꾸기 ====================
		/*
		 * 1. String.valueOf(1);
		 * 2. +""붙이기
		 * 3. .toString()
		 */
		System.out.println(1);
		System.out.println(String.valueOf(1) instanceof String);
		System.out.println(1+"" instanceof String);
		System.out.println(Integer.valueOf(1).toString() instanceof String);
			
	}
}
