package com.cookie.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Operator3 {	
		/*
		 * 알파벳 하나를 입력 받아 소문자인지
		 * 판별하는 프로그램 
		 */
	public static void main(String [] args) {	
	boolean result;
	Scanner sc = new Scanner(System.in);
	System.out.print("알파벳 하나 입력 : ");
	char word = sc.next().charAt(0);
	result=(word>=65)&&(word<=90);
	System.out.println(result);
	}
}
