package com.cookie.day10.oop.polymorphism;

class Car{}
class Gtr extends Car{}
class Supra extends Car{}
class Nsx extends Car{}

public class Exam_InstanceOf {
	static void print(Car car) {
		if(car instanceof Gtr) {
			System.out.println("지티알 점프!!");
		}
		if(car instanceof Supra) {
			System.out.println("수프라 킥!!");
		}
		if(car instanceof Nsx) {
			System.out.println("에넥스 펀치!!");
		}
	}
	public static void main(String[] args) {
		print(new Car());
		print(new Gtr());
		print(new Supra());
		print(new Nsx());
	}
}
