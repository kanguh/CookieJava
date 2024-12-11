package com.cookie.day11.oop.objectpkg;

import com.cookie.day10.oop.encapsulation.Book;

class Member{
	//필드
	String name;
	int age;
	String email;
	String phone;
	String address;
	
	//생성자
	public Member() {}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public Member(String email, String phone, String address) {
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	public Member(String name, int age, String email, String phone, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	//메소드
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat() {}
	public void sleep() {}
	
	@Override
	public String toString() {
		return "이름 : " +name+
				", 나이 : " +age+
				", 이메일 : "+email+ 
				", 전화번호 : " +phone+
				", 주소 : "+address;
		
	}
}
public class Exam_ObjectProperty {
	
	static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
	}
	
	public static void main(String[] args) {
		String data = "java";
		if("java".equals(data)) {
//		if("java" == data) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		Member mem = new Member("일용자", 22, "khuser1@kh.com", "010-1234-5678", "서울시 중구");
		print(mem);
		Book book = new Book();
		print(book);
	}
}
