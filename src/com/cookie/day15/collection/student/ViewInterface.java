package com.cookie.day15.collection.student;

import java.util.List;

public interface ViewInterface {
	
	/**
	 * 학생 정보 입력
	 * @return Student
	 */
	public Student inputStudent();
	
	/**
	 * 학생이름 입력 메소드
	 * 항목 전달값으로 항목구분
	 * @param category
	 * @return String
	 */
	public String inputName(String category);
	
	/**
	 * 학생정보 수정
	 * @param student
	 * @return Student
	 */
	public Student modifyStudent(Student student);

	/**
	 * 메인메뉴 출력
	 * 입력받은 값은 리턴
	 * @return int
	 */
	public int printMenu();
	
	/**
	 * 학생 전체 정보 출력
	 * @param stdList
	 */
	public void displayStudents(List<Student>stdList);
	
	/**
	 * 전달값 메시지 출력
	 * @return msg
	 */
	public void displayMsg(String msg);
}