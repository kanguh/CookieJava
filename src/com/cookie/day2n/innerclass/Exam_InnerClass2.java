package com.cookie.day2n.innerclass;

class Outer {
	class InstanceClass {}
	static class StaticClass {}
	
	void sample() {
		class LocalClass {}
	}
	

}

public class Exam_InnerClass2 {
	/*
	 * 이너클래스의 종류
	 * 1. 인스턴스 클래스 : 외부 클래스의 멤버변수 선언 위치에 선언, 외부 클래스의 인스턴스 멤버처럼 사용
	 * 2. 스태틱 클래스	  : 외부 클래스의 멤버변수 선언 위치에 선언, 외부 클래스의 static 멤버처럼 사용
	 * 3. 지역 클래스	  : 외부 클래스의 메소드나 초기화 블럭 안에 선언, 선언된 메ㅅ드 블록 영역 내부에서만 사용
	 * 4. 익명 클래스	  : 클래스의 선언과 객체의 생성을 동시에 하는 이름 없는 클래스, 일회용으로 사용.
	 */
}
