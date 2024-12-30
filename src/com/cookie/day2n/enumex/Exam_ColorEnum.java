package com.cookie.day2n.enumex;

public class Exam_ColorEnum {
	public enum Color {
		RED, GREEN, BLUE
	}
	
	public static void main(String[] args) {
		Color myColor = Color.RED;
		//myColor = Color.YELLOW; - > 타입안정성 보장
		printColor(myColor);
	}
	
	static void printColor(Color color) {
		switch(color) {
		case RED :
			System.out.println("빨강");
			break;
		case GREEN :
			System.out.println("초록");
			break;
		case BLUE :
			System.out.println("파랑");
			break;
		}
	}
}
