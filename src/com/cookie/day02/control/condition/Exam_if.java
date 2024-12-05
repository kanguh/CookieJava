package com.cookie.day02.control.condition;

import java.util.Scanner;

public class Exam_if {
	public static void main(String [] args) {
		/*
		 *  제어문 - 조건문
		 *  문법
		 *  if (조건식) { 실행문장;}
		 *  else {실행문장2;}
		 */
		//입력 받은 정수가 0보다 큰지 판별하는
		//프로그램을 작성
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 하나 입력 : ");
//		int input = sc. nextInt();
//		if (input>0) {	
//			System.out.println("크다");
//		}else {
//			System.out.println("작다");
//		}
//		
//		System.out.print("정수 하나 입력 : ");
//		input=sc.nextInt();
//		if(input%2==0) {
//			System.out.println("짝수입니다");
//		}else {
//			System.out.println("홀수입니다");
//		}
		
		System.out.print("정수 하나 입력 : ");
		int input = sc .nextInt();
//		if(input==0) {
//			System.out.print("0입니다");
//		}else {
//			if(input>0) {
//				System.out.print("양의정수");
//			}else {
//				if(input<0) {
//					System.out.print("음의정수");
//				}
//			}
//		}
		//삼항연산자로 작성해보기
		String result = (input==0)? "0" :  (input>0)?"양의 정수":"음의 정수";
//		if (input>0 || input<0) {
			System.out.println(result);
//		}else {
//			System.out.println("0입니다");
//		}
	}
}
