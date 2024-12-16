package com.cookie.day14.collection.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice_Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차점수 : ");
		int firstScore = sc.nextInt();
		System.out.print("2차점수 : ");
		int secondScore = sc.nextInt();
		//student 객체에 넣어야 함
		//기본 생성자 이용
		Student student = new Student();
		student.setName(name);
		student.setFirstScore(firstScore);
		student.setScondScore(secondScore);
		//매개변수 있는 생성자 이용
		student = new Student(name, firstScore, secondScore);
		//그 후에 ArryList 객체에 넣어야함 
		List<Student> stdList = new ArrayList<Student>();
		stdList.add(student);
		
		Student std = (stdList.get(0));
		System.out.println(std.toString());
	}
}
