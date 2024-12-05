package com.cookie.day02.operator;

public class Exam_Losical {
	public static void main(String [] args) {
		/*
		 * 논리 연산자
		 * 조건 2개이상의 경우 조건의 결과를
		 * 연결해준는 연산자
		 * 1. 남자이면서 평균평점 4.0이상인사람
		 * 2. 컴공또는 경영인 사람
		 * %%, ||
		 */
		boolean result1, result2, result3, result4;
//		int num1 = 50;
//		int num2 =30;
//		result1 = (num1 == num2) && (num1 < num2);//false
//		result2 = (num1 == num2) || (num1 < num2);//false
//		result3 = (num1 > num2) && (num1 != num2);//true
//		result4 = (num1 > num2) || (num1 == num2);//true
//		System.out.println(result1);
//		System.out.println(result2);
//		System.out.println(result3);
//		System.out.println(result4);
		
		/*
		 * 문제
		 * a는 70, b는 55
		 * result1 = (a==b) || ( a++ < 100);
		 * result2 = (a<b) && (--b<55);
		 * result3 = (a != b) && (b-- < a++);
		 * result4 = (a++ != b) || (b++ >= 85);
		 * a,b의 값을 생각해보고
		 * result들의 값을 예상해보세요.
		 * 
		 * result1=true a=71, b=55
		 * result2=false a=71, b=55
		 * result3=true a=72, b=54
		 * result4=true a=73,b=54
		 * 
		 */
		int a = 70;
		int b = 55;
		result1 = (a==b) || ( a++ < 100);
		result2 = (a<b) && (--b<55);
		result3 = (a != b) && (b-- < a++);
		result4 = (a++ != b) || (b++ >= 85);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
