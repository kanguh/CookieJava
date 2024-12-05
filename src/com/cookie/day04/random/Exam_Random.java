package com.cookie.day04.random;

import java.util.Random;
import java.util.Scanner;

public class Exam_Random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		//rand.nextInt(n)
		//n을 넘겨주면 rand.nextInt(n)의 결과값은 0~n-1 사이의 랜덤할 수를 리턴
//		for(int i = 0; i < 10; i++)
//			System.out.println(rand.nextInt(10));
//		1~10사이의 랜덤항 수를 출력하는 프로그램
//		for(int i=0; i<10; i++)
//			System.out.print((rand.nextInt(10)+40)+" ");
		//25~35
//		for(int i=0; i<50; i++) {
//			System.out.print((rand.nextInt(10)+25)+" ");
//		}
		//Math.random()*(최대-최소+1)+최소
		System.out.println((int)(Math.random()*10)+1); 

	}
}
