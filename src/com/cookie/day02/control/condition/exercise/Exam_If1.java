package com.cookie.day02.control.condition.exercise;

import java.util.Scanner;

public class Exam_If1 {
	public static void main(String [] args) {
		/*
		 * 문제1
		 * 점수와 학년을 정수로 입력받아 60점 이상이면 합격
		 * 60점 미만이면 불합격으로 출력한다.
		 * 단, 4학년의 경우 70점 이상이어야 합격을 출력하는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("학년을 입력해주세요(1~4) : ");
		int grade=sc.nextInt();
		System.out.print("점수를 입력해주세요(1~100) : ");
		int point=sc.nextInt();
		String result=point>=60 ? "합격입니다":"불합격입니다";		System.out.println(result);
		if (point>=60) {
			if(grade == 4 && point<70) {
				System.out.println("불합격입니다.");
				return;
			}
			System.out.println("합격입니다.");
		}else{
			System.out.println("불합격입니다.");
		}
	}
}
