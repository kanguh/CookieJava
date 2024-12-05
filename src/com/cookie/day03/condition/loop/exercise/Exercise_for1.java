package com.cookie.day03.condition.loop.exercise;

import java.util.Scanner;

public class Exercise_for1 {
	public static void main(String [] args) {
		//2단 출력
		for(int i=1; i<=9; i++)
			System.out.println("2 * "+i+" = "+(2*i));
		
		/*
		 * 문제1
		 * 정수 하나를 입력받아서 그수가 1~9 사이으 수일때만 그 수의 구구단을 출력
		 * 조건이 맞지 않으면 1~9사이의 양수를 입력하세요 출럭
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 하나 입력 : ");
		int num=sc.nextInt();
		if(num>=1&&num<=9) {	//1~9사이의 양수 일때만 출력하도록
			System.out.println(num+"단 출력");
			for(int i=1; i<=9; i++)
			System.out.println(num + " * " + i + " = " +num*i);
		}else {					//1~9사이의 숫자가 아닐때의 메시지를 출력
			System.out.println("1~9사이의 양수를 입력하세요");
		}
	}
}
