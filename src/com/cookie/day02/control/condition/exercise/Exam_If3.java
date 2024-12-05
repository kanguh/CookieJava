package com.cookie.day02.control.condition.exercise;

import java.util.Scanner;

public class Exam_If3 {
	public static void main(String [] args) {
		/*
		 * 문제3
		 * 점수를 입력받아 등급을 알려주는 프로그램을 작성하세요.
		 * 단, 점수는 0 ~ 100 사이의 수를 입력하도록 함.
		 * 점수를 입력해주세요 : 92
		 * 학점은 A입니다.
		 * 
		 * 점수를 입력해주세요 : 102
		 * 0 ~ 100 사이의 수를 입력해주세요
		 * 커트라인 ( 90 ~ 100 : A, 89 ~ 80 : B, 79 ~ 70 : C, 69 ~ 60 : D, 그 외 F )
		 */
		Scanner sc = new Scanner(System.in);
		char grade = 0;
		System.out.print("점수 입력 : ");
		int point = sc.nextInt();
		if(point>100 || point<1) {
			System.out.println("0~100사이의 점수를 입력하세요.");
		}else {
			if (point >=90) {
				grade ='A';
			}else if(point>=80) {
				grade ='B';
			}else if(point>=70) {
				grade ='C';
			}else if(point>=60) {
				grade ='D';
			}else {
				grade ='F';
			}
		}
		if (grade != 0);{
		System.out.println(grade);
		}
	}
}

