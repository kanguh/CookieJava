package com.cookie.day2n.enumex;

enum DevelType{
	MOBILE, WEB, SERVER, FULLSTACK, FRONTEND, BACKEND
}

public class Developer {
	private String name ;
	private long salary;
	//private DeveloperType type;
	private enum DevType {
		MOBILE, FRONTEND, BACKEND
	}
}
