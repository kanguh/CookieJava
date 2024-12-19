package com.cookie.day12.oop.exercise;

public class Person {
	//필그
	private String name;
	private int age;
	
	//생성자 - 클래스와 같은 이름 메소드
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String inform() {
		return name + "님(+ age+세)";
	}
	
	@Override
	public String toString() {
		return "이름 : "+name+", 나이 : "+age;
	}
	public static void main(String[] args) {
		Person[]pArr = new Person[3];
		pArr[0].getAge();
	}
}
