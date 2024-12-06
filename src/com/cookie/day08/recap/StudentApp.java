package com.cookie.day08.recap;

import java.util.Scanner;

class Student {
	static String name ="";
	static int kor = 0;
	static int eng = 0;
	static int math = 0;
	static double avg = 0;
}

public class StudentApp {
	//필드 (멤버변수)
	static Scanner sc = new Scanner(System.in);//필드
	//static Student st = new Student();
	
	public static void main(String[] args) {
		while(true) {
			int menu = printMenu();
			switch(menu) {
			case 1 : 
				inputStudentData();
				break;
			case 2 : 
				// 출력
				 printStudentData();
				break;
			case 3 : 
				// 종료
				displayMessage();
				return;
			}
		}
	}
	//printMenu()
	static int printMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int menu = sc.nextInt();
		return menu;
	}
	// inputStudentData()
	static void inputStudentData() {
		System.out.println("====== 성적 입력 ======");
		System.out.print("이름 : ");
		Student.name = sc.next();
		System.out.print("국어 : ");
		Student.kor = sc.nextInt();
		System.out.print("영어 : ");
		Student.eng = sc.nextInt();
		System.out.print("수학 : ");
		Student.math = sc.nextInt();
		Student.avg = (Student.kor + Student.eng + Student.math)/3.0;
	}
	// printStudentData
	static void printStudentData() {
		System.out.println("====== 성적 출력 ======");
		System.out.println("이름 : "+ Student.name);
		System.out.println("국어 : "+ Student.kor);
		System.out.println("영어 : " + Student.eng);
		System.out.println("수학 : " + Student.math);
		System.out.println("총점 : " + (Student.kor + Student.eng + Student.math));
		System.out.println("평균 : " + Student.avg);
	}
	// displayMessage
	static void displayMessage() {
		System.out.println("프로그램이 종료되었습니다.");
	}
}
