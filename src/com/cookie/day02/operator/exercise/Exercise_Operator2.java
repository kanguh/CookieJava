package com.cookie.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Operator2 {	
		/*
		 * 정수 하나를 입력 받아 1부터 100사이의 숫자인지
		 * 판별하는 프로그램 
		 */
	public static void main(String [] args) {	
	boolean result;
	Scanner sc = new Scanner(System.in);
	System.out.print("정수 하나 입력 : ");
	int num = sc.nextInt();
	result = (1<=num) && (num<=100);
	System.out.println(result);
	}
}
