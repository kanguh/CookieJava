package com.cookie.day03.condition.loop;

public class Exam_For {
	public static void main(String [] args) {
		/*
		 * 반복문
		 * 실행문장을 원하는 횟수만큼 반복해줌
		 * 문법
		 * for(초기식; 조건식; 반복작업할 증감식){실행문장;}
		 */
		for(int i=0; i<10; i++)
			System.out.println("Hello World");
		
		//1부터 10까지 출력하기
		for(int i=1; i<=10; i++)
			if(i!=10) {
				System.out.print(i+",");			
			}else {
				System.out.print(i);
			}
	}
}
