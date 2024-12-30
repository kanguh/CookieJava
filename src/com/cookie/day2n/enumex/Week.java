package com.cookie.day2n.enumex;

public enum Week {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRUDAY, SATURDAY, SUNDAY ;
	
	//주중, 주말 체크하는 메소드
	public boolean isWeekEnd() {
		return this == SATURDAY || this == SUNDAY;
	}
}
