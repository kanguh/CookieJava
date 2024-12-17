package com.cookie.day15.collection.student;

import java.util.List;

public class StudentContorller {
	public static void main(String[] args) {
		StudentView view = new StudentView();
		StudentManage manage = new StudentManage();
		String name;
		int index;
		List<Student>sList;
		finish:
		while(true) {
			int menu = view.printMenu();
			switch(menu) {
			case 1: 
				Student student = view.inputStudent();
				manage.registerStudent(student);
				break;
			case 2:
				name = view.inputName("검색"); // 검색할 이름 입력
				sList = manage.searchListByName(name); // 이름을 Manage sList에서 검색하고 list 에 담기
				view.displayStudents(sList); // 해당 List 출력
				break;
			case 3: 
				sList = manage.selectAllStudents(); // 학생 전체 정보 가져어옴
				view.displayStudents(sList); // 가져온 정보 출력
				break;
			case 4:
				name = view.inputName("수정");
				index = manage.searchIndexByName(name);
				if(index != -1) { // 수정할 데이터가 존재하면 수정할 데이터 입력
					student = manage.searchOneByName(name); // 이름으로 검색해서 저장된 정보 가져오기
					student = view.modifyStudent(student);  // 저장된 정보를 수정해서 리턴 -> 수정할 정보가 student 안에 있음. 
					manage.modifyStudent(index, student); // 인덱스와 수정된 정볼를 저장한 student 넘겨서 대체하기
				}
				break;
			case 5: 
				name = view.inputName("삭제"); // 삭제할 이름 입력 받기
				index = manage.searchIndexByName(name); // 이름으로 인덱스 검색, 인덱스로 지우기 위해
				if(index != -1) // 데이터가 있을때 동작
					manage.deleteStudent(index); // 인덱스를 넘겨 remove
				break;
			case 6:
				name = view.inputName("재평가 여부확인"); // 이름 입력 받기
				student = manage.searchOneByName(name); // 이름으로 정보 찾기
				String msg = manage.searchFailResult(student); // 재평가여부 확인 리턴
				view.displayMsg(msg); // 결과 스트링 출력
				break;
			case 0: 
				view.displayMsg("종료되었습니다.");
				break finish;
			default: 
				view.displayMsg("0~6사이의 수를 입력하세요.");
				break;
			}
		}
	}
}
