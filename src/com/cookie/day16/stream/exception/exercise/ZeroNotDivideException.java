package com.cookie.day16.stream.exception.exercise;

public class ZeroNotDivideException extends Exception{
	/*
	 * 사용자 정의 예외
	 * 표준 에외 클래스로도 많은 예외상황을 표현 할 수 있으나
	 * 특정 오류나 메시지를 강조하고 싶을때 직접 예외 클래스를 만들어 사용가능
	 * 만들기 전에 내가 만드는 예외 클래스가 Checked인지 Unchecked인지 결정해야함
	 * 
	 */
	public ZeroNotDivideException() {
		super();
	}
	public ZeroNotDivideException(String message) {
		super(message);
	}
}
