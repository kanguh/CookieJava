package com.cookie.day10.oop.overriding.exercise;

class SuperClass {
	void paint() {
		draw();
	}
	void draw() {
		System.out.println("super");
	}
}

class SubClass extends SuperClass{
	void paint() {
		super.paint();
		super.draw();
	}
	void draw() {
		System.out.println("sub");
	}
}

public class Exercise_overriding {
	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint();
	}
}
