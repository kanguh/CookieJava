package com.cookie.day15.collection.student;

import java.util.List;

public interface ManageInterface {
	
	/**
	 * 학생정보 Student List 에 저장
	 * @param student
	 */
	void registerStudent(Student student);
	
	/**
	 * 학생 정보 수정
	 * Student List에 있던값 대체
	 * @param index
	 * @param student
	 */
	void modifyStudent(int index, Student student);

	/**
	 * 학생정보 삭제
	 * 인덱스로 삭제
	 * @param index
	 */
	void deleteStudent(int index);

	/**
	 * 이름으로 학생 정보 검색
	 * 동명이인 포함
	 * @param name
	 * @return List<Student>
	 */
	List<Student> searchListByName(String name);
		
	/**
	 * 이름으로 학생 1인 정보 검색
	 * @param name
	 * @return Student
	 */
	Student searchOneByName(String name);
	
	/**
	 * 이름으로 인덱스 값 구하기
	 * 인덱스로 삭제/수정하기 위해
	 * @param name
	 * @return int
	 */
	public int searchIndexByName(String name);
		
	/**
	 * Student List 전체정보 리턴
	 * @return List<Student>
	 */
	List<Student> selectAllStudents();
	
	/**
	 * 재평가 대상 여부 확인
	 * @param name
	 */
	String searchFailResult(Student student);
		
}
