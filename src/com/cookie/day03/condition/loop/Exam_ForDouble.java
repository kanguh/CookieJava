package com.cookie.day03.condition.loop;

public class Exam_ForDouble {
	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			System.out.println("=="+i+"단 출력==");
			for(int j=1; j<10; j++)
				System.out.println(i+" * "+j+" = "+j*i);
		}
	}
}
