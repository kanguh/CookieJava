package com.cookie.day03.condition.loop.exercise;

public class Exercise_While1 {
	public static void main(String[] args) {
		//문제 1-1
		//1~10까지의 합
		int i=1;
		int sum=0;
//		while(i<=10) {
//			sum+=i;
//			i++;
//		}
//		System.out.println(sum);
		
		//문제 1-2
		//1~100사이의 홀수의 합
		while(i<=100) {
			if(i%2 != 0) { sum+=i;
		}
		i++;
		}
		System.out.println(sum);
		//#2
		while(i<=100) {
			sum += i;
			i+=2;
		}
		System.out.println(sum);
	}
}
