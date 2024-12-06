package com.cookie.day08.oop;

import java.util.Scanner;

public class Rectangle {
	/*
	 * 너비와 높이를 입력 받아 사각형의 합을 출력하는 프로그램을 작성하라. 
	 * 너비(width)와 높이(height) 필드, 그리고 
	 * 면적 값을 제공하는 getArea() 메소드를 가진 Rectangle 클래스를 만들어 활용하라.
	 */
	double height;
	double width;
	
	
	public double getArea() {
		return height*width;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle nemo = new Rectangle();
		System.out.print("너비를 입력해주세요 : ");
		nemo.width=sc.nextDouble();
		System.out.print("높이를 입력해주세요 : ");
		nemo.height=sc.nextDouble();
		System.out.println("네모의 넓이는 : "+nemo.getArea());
	}
}
