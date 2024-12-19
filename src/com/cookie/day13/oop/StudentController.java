package com.cookie.day13.oop;

public class StudentController {
	public static void main(String[] args) {
		StudentView view = new StudentView();
		StudentManage manage = new StudentManage();
		exit:
		while(true) {
			int menu = view.mainMenu();
			switch(menu) {
			case 1: 
				Student student = view.inputStudentData();
				manage.insertStudent(student);
				break;
			case 2: 
				Student [] students = manage.getStudents();
				view.printStudentData(students[0]);
//				view.printStudentData(students[1]);
//				view.printStudentData(students[2]);
				break;
			case 3:
				view.displayMessage("프로그램이 종료되었습니다.");
				break exit;
			default: view.displayMessage("1~3사이의 수를 입력해주세요.");
			}
		}
	}
}