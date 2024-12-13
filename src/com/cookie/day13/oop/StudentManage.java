package com.cookie.day13.oop;


//저장하고 로드하는 기능을 가진 클래스
public class StudentManage {
	private Student [] 	students = new Student[3];
	private int 		index;
	
	public StudentManage() {
		students = new Student[3];
		index = 0;
	}
	
	public void insertStudent(Student student) {
		students[index] = student;
		index++;
		
//		String name = sc.next();
//		students[index].setName(name);
//		students[index].setKor(sc.nextInt());
//		students[index].setEng(sc.nextInt());
//		students[index].setMath(sc.nextInt());
		
//		for(int i=0; i<students.length; i++) {
//			students[0] = new Student();
//			students[0].name = sc.next();
//			students[0].kor = sc.nextInt();
//			students[0].eng = sc.nextInt();
//			students[0].math = sc.nextInt();
//		}
	}
	public Student [] getStudents() {
		return students;
	}
}
