package com.cookie.day08.method;

public class Exam_Method {

		/*
		 * 리턴형 o, x
		 * 매개변수 o, x
		 * 
		 * 리턴형 x, 매개변수 x
		 * 리턴형 x, 매개변수 o
		 * 리턴형 o, 매개변수 x
		 * 리턴형 o, 매개변수 o
		 * 
		 */
	public void noReturnNoParam() {
		System.out.println("noReturnNoParam");
		return;
	}
	
	public void noReturnYesParam(int num) {
		System.out.println("num : "+ num);
	}
	
	public int yesReturnNoParam() {
		int date = 20241206;
		return date;
	}
	
	public int yesReturnYesParam(int num) {
		 num+=10;
		return num; // 생략불가
	}
	
	public int sum(int ... numbers) {
		int sum = 0;
		for(int num:numbers) {
			sum+=num;
		}
		return sum;
	}
}
