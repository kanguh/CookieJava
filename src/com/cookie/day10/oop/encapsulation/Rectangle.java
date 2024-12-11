package com.cookie.day10.oop.encapsulation;

import java.util.Scanner;

public class Rectangle {
	double height;
	double width;
	
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return this.height;
	}
	public double getWidth() {
		return this.width;
	}
	
	public double getArea() {
		return height*width;
	}
}
class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle nemo = new Rectangle();
		System.out.print(">> ");
		double height=sc.nextDouble();
		nemo.setHeight(height);
		double width=sc.nextDouble();
		nemo.setWidth(width);
		System.out.println("네모의 넓이는 : "+nemo.getArea());
	}
}