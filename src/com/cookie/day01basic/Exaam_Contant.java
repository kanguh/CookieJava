package com.cookie.day01basic;


public class Exaam_Contant {
	public static void main(String [] args) {
		//원의 면적을 구하는프로그램을 작성해보자.
		/*
		 * 원의 면적 = 반지름*반지름*PI
		 */
		final double PI = 3.14;
		double radius = 10.2;
		radius = 5.2;
		double circleArea = radius * radius * PI;
		System.out.print("원의 면적 : " + circleArea);
	}
}
