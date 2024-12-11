package com.cookie.day11.oop.abstracking;

public class Line extends Shape{
	@Override //->오버라이딩을 강제하게 된다.
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("I'm Line");
	}
}
