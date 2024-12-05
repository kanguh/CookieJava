package com.cookie.day02.control.condition;

import java.util.Scanner;

public class Exam_Switch {
	public static void main(String [] args) {
		/*
		 * 제어문 - 조건문
		 * switch문
		 * 문법 
		 * switch(변수){
		 * 		case 변수 예상값 :
		 * 			실행문1;
		 * 			break;
		 * 		case 변수 예상값2;
		 * 			실행문2;
		 * 			break;
		 * 
		 * ex)
		 * switch(num) {
		 * 		case1: 실행문2; break;
		 * 		case2: 실행문3; break;
		 * 		case3: 실행문3; break;
		 * 		default: 실행문0;
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수하나 입력 : ");
		int num=sc.nextInt();
		switch(num) {
			case 1:System.out.println("빨간색");break; 
			case 2:System.out.println("노란색");break; 
			case 3:System.out.println("초록색");break;
			default: System.out.println("1~3사이의 수 입력");
		}
		if (num==1) {
			System.out.println("빨간색");
		}else if (num==2) {
			System.out.println("노란색");
		}else if (num==3) {
			System.out.println("초록색");
		}else {
			System.out.println("1~3사이의 수를 입력해주세요");
		}
		
	}
}
