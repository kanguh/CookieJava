package com.cookie.day15.collection.student;

import java.util.ArrayList;
import java.util.List;

public class StudentManage implements ManageInterface{
	private List<Student> sList;
	
	public StudentManage() {
		this.sList = new ArrayList<Student>();
	}

	@Override
	public void registerStudent(Student student) {
		sList.add(student);
	}

	@Override
	public void modifyStudent(int index, Student student) {
		sList.set(index, student);
	}

	@Override
	public void deleteStudent(int index) {
		sList.remove(index);
		
	}

	@Override
	public List<Student> searchListByName(String name) {
		List<Student> searchList = new ArrayList<Student>(); // 이렇게만 return 하면 비어있는 값임
			if(name!=null) { // 이름이 입력되었을때 동작하도록
				for(Student std: sList) { // sList를 검색하여 name 과 같은값 찾기
					if(name.equals(std.getName())) {
						searchList.add(std); // searchList에 추가
					}
				}
				return searchList;
			}
		return null;
	}

	@Override
	public Student searchOneByName(String name) {
		if(name != null) {
			for(Student std: sList) {
				if(name.equals(std.getName())) {
					return std; //찾으면 그 값을 리턴
				}
			}
		}
		return null; // 없으면 null 리턴
	}

	@Override
	public int searchIndexByName(String name) {
		int count = 0; //forEach는 i 가 없어서 선언해줌
		if(name!=null) { // name 을 입력했을때 동작
			for(Student std : sList) { // forEach문으로 동작
				if(name.equals(std.getName())) {// 이름이 같은지 확인
					return count; // 같을때의 인덱스 리턴
				}
				count++; // 이름이 다르면 인덱스 증가
			}
		}
		return -1; // 없으면 -1 리턴
	}

	@Override
	public List<Student> selectAllStudents() {
		
		return sList;
	}

	public String searchFailResult(Student student) { // 이름으로 찾은 학생 정보 넘어옴
		if(student != null) { // 정보가 있을때 동작
			int firstScore, secondScore;
			firstScore = student.getFirstScore();
			secondScore = student.getSecondScore(); // 1,2 차 점수 설정
			double avg = (firstScore+secondScore)/2.0; // 평균 구하기
			StringBuffer sb = new StringBuffer(); // 결과값 String을 담을 객체
			if(avg>=60) {
				if(firstScore<40) {
					sb.append("1차시험 재평가");
				}else if(secondScore<40)	{
					sb.append("2차시험 재평가");
				}else {
					sb.append("평균 " +avg+ "점으로 통과");
				}
			}else {	// 3가지 결과중 1개만 담김
				if(firstScore<60) {
					sb.append("1차시험 재평가\n");
				}
				if(secondScore<60) {
					sb.append("2차시험 재평가");
				} // 2가지 결과가 담길 수 있음
			}
			return sb.toString();
		}
		return null;
	}
}
