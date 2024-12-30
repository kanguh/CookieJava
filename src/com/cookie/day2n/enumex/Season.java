package com.cookie.day2n.enumex;

public enum Season {
	SPRING("봄"), SUMMER("여름"), AUTUMM("가을"), WINTER("겨울");
	
	//열겨형 상수에 대응하는 문자열 값을
	//저장할 변수
	//ex) 봄, 여름, 가을, 겨울
	private String season;
	
	//생성자
	//상수(한글)
	private Season(String season) {
		this.season = season;
	}
	
	public String getSeason() {
		return season;
	}
}
