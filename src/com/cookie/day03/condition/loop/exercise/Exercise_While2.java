package com.cookie.day03.condition.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main(String [] args) {
		/*
		 * while문을 이용하여 -1이 될때까지 
		 * 정수를 입력받고 -1이 입력되면 
		 * 입력한 수의 합을 출력하시오
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		int i = sc.nextInt();
		int sum=0;
		while(i!=-1) {
			sum+=i;
			System.out.print("값 : ");
			i = sc.nextInt();
		}
		System.out.println("합 : " + sum);
	}
}
