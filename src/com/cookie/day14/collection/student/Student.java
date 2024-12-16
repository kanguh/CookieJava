package com.cookie.day14.collection.student;


//Value Object(VO) 저장용 클래스
public class Student {
	//필드
	private String name;
	private int firstScore;
	private int scondScore;
	
	//생성자
	public Student() {}
	
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.scondScore = secondScore;
	}
	
	//메소드
	//getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
//		return;
	}

	public int getFirstScore() {
		return firstScore;
	}

	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}

	public int getScondScore() {
		return scondScore;
	}

	public void setScondScore(int scondScore) {
		this.scondScore = scondScore;
	}
	
	//toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", firstScore=" + firstScore + ", scondScore=" + scondScore + "]";
	}
	
}
