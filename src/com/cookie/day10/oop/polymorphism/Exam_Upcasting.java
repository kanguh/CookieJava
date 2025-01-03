package com.cookie.day10.oop.polymorphism;

class Person {
	String name;
	String id;
	
	public Person() {}
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

class Student extends Person {
	String grade;
	String department;
	public Student() {
		super();
	}
	public Student(String name, String id, String grade, String department) {
		super(name, id);
		this.grade = grade;
		this.department = department;
	}
}
class Worker extends Person{}

class Doctor extends Person{}

public class Exam_Upcasting {
	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student();
		p=s;
		p.id = "khuser1";
		p.name = "일용자";
		p = new Worker();
		p = new Doctor();
	}
}
