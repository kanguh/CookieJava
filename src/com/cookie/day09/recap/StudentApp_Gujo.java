package com.cookie.day09.recap;

import java.util.Scanner;

class Student {
	static String name ="";
	static int kor = 0;
	static int eng = 0;
	static int math = 0;
	
	public static int total() {
		return kor+eng+math;
	}
	public static double avg() {
		return (kor+eng+math)/3.0;
	}
}

public class StudentApp_Gujo {
	static Scanner sc = new Scanner(System.in);
	//Student Student = new Student();
	public static void main(String[] args) {
		while(true) {
			int menu = printMenu();
			switch(menu) {
			case 1 : 
				inputStudentData();
				break;
			case 2 :
				printStudentData();
				break;
			case 3 :
				displayMessage("프로그램이 종료되었습니다.");
				break;
			default:
				displayMessage("1~3사이으 숫자를 입력해주세요.");
				break;
			}
		}
	}
	static int printMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int menu = sc.nextInt();
		return menu;
	}
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
	}
	static void printStudentData() {
		System.out.println("====== 성적 출력 ======");
		System.out.println("이름 : " + Student.name);
		System.out.println("국어 : " + Student.kor);
		System.out.println("영어 : " + Student.eng);
		System.out.println("수학 : " + Student.math);
		System.out.println("총점 : " + Student.total());
		System.out.println("평균 : " + Student.avg());
	}
	static void displayMessage(String message) {
		System.out.println(message);
	}
}
