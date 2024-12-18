package com.cookie.day16.stream.exception;

import com.cookie.day16.stream.exception.exercise.ZeroNotDivideException;

public class Exam_Exception {
	/*
	 * 예외처리란 무엇인가?
	 * 예외의 종류는 무엇이 있는가?
	 * Checked/Unchecked Exception 의 차이는 무엇인가?
	 * 예외의 최고 조상 클래스는 무엇인가?
	 * - 예외 처리 방법
	 * 1. try-catch 사용 발생한 곳에서 직접 처리
	 * 2. throws 를 사용하여 예외 회피
	 */
	public static void main(String[]args) {
			try {
				int result = divNum(10,0);
			} catch (ArithmeticException | ZeroNotDivideException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static int divNum(int data1, int data2)  throws ArithmeticException, ZeroNotDivideException{
		/*
		 * 나누기를 할때 0으로 나누느 경우를 대비해야함
		 * 자바에서는 try~catch 예외처리임
		 * 그런데 0으로 나눌 경우를 대비하는것을 회피하는 방법이 있는데
		 * 그게 바로 밑에 코드처럼 try ~ catch 를 사용하지 않고
		 * throws 로 예외를회피함
		 * 그러면 어디서 try~catch 를 해야하는가는 main 메소드를 보면 알 수 있는데
		 * main 메소드는 divNum()을 호출하고 있고
		 * 호출하면 회피된 예외를 처리해주어야함
		 * 그래서 try~catch 가 main 메소드에 있는것임
		 */
		if(data2 == 0) {
			throw new ZeroNotDivideException("ZeroNotDivide");
		}
		int result = data1/data2;
		return result;
//		int result = 0;
//		try {
//			result = data1/data2;
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("0으로 나눌 수 없습니다.");
//		}

	}
}
