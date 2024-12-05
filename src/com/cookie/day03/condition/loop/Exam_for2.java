package com.cookie.day03.condition.loop;

public class Exam_for2 {
		/*
		 * 문제2-1
		 * 1부터 10까지의 덧셈을 구하는 프로그램을 작성
		 * 문제2-2
		 * 1부터 10까지의 덧셈을 표시하고 합고 구하는 프로그램을 작성
		 */
	public static void main(String [] args) {
		int sum = 0; //연산은 두개의 항이 필요하므로 sum을 선언하여 i와 연산
		for(int i=1; i<=10; i++) {
			sum=sum+i;// sum+=i // 누적합
			if(i!=10) System.out.print(i+" + ");
			else System.out.print(i+" = ");
		}
		System.out.print(sum);
	}
}
