package com.cookie.day01.printbasic;

public class Exam_PrintSample {
	public static void main(String [] args) {
		System.out.print("지금까지와 다른 출력 명령어");
		System.out.println(); //줄바꿈을 해준다(ln)
		System.out.println("지금까지 출력 할때 쓰던 명령어");
	
		/*
		 * printf 명령어
		 * 형식문자
		 * 정수 %d
		 * 실수 %f
		 * 문자열 - %s
		 * 불린 - %b	
		 */
		System.out.printf("정수의 값 : %d\n", 1105);
		System.out.printf("실수의 값 : %f\n", 5.2);
	}
}
