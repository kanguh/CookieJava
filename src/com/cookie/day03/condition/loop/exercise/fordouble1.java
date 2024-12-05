package com.cookie.day03.condition.loop.exercise;

public class fordouble1 {
	public static void main(String[] args) {
		/*
		 * 0시0분부터 23시 59분까지 출력
		 * 0시 0분
		 * 0시 1분
		 * 
		 */
		for(int j=0; j<24; j++) {
			for(int i=0; i<=59; i++) 
			System.out.println(j+"시 "+i+"분");
		}
	}
}
