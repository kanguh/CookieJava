package com.cookie.day01.operator;

import java.util.Scanner;

public class Exam_Arithmentic {
	public static void main(String [] args) {
		//초 단위의 정수를 입력받고, 몇시간, 몇분, 몇초인지
		//출력하는 프로그램
		//초단위 정수 입력 : 3000
		//0시간 50분 00초 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초 단위 정수 입력 : ");
		int sec = sc.nextInt();
		int second = sec%60;
		int hour=sec/3600;
		int minuate=sec/60;
		System.out.println(hour+"시간"+minuate+"분"+second+"초");
		
		//System.out.println((sec/3600)+"시간"+(sec/60)+"분"+(sec%60)+"초");
//		System.out.println(11+18);
//		System.out.println(11-18);
//		System.out.println(11*18);
//		System.out.println(11/18); // 몫이 나옴
//		System.out.println(11%18); // 나머지가 나옴
//		System.out.println(9/2);
//		System.out.println(9%2);
	}
}
