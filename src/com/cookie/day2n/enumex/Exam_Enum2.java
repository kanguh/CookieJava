package com.cookie.day2n.enumex;

interface University {
	int SEOUL = 1;
	int YONSEI = 2;
	int KOREA = 3;
}

enum Major {
	KOREAN, MATH, ENGLISH, SCIENCE
}

//interface Major {
//	int KOREAN = 1;
//	int MATH = 2;
//	int ENGLISH = 3;
//	int SCIENCE = 4;
//}

public class Exam_Enum2 {
	public static void main(String[] args) {
		Major major = Major.MATH;
		
		switch(major) {
		case KOREAN : 
			System.out.println("국어국문과");
			break;
		case MATH : 
			System.out.println("수학과");
			break;
		case ENGLISH : 
			System.out.println("영어영문과");
			break;
		case SCIENCE : 
			System.out.println("자연과학과");
			break;
		}
	}
}
