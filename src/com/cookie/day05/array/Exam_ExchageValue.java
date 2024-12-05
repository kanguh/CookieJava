package com.cookie.day05.array;

public class Exam_ExchageValue {
	public static void main(String[] args) {
		System.out.println("배열로 교환");
		int [] spaces = {24, 25};
		//출력코드
		for(int val:spaces)
			System.out.println(val);
		System.out.println("exchanged!!");
		//교환코드
		int temp = spaces[0];
		spaces[0]=spaces[1];
		spaces[1]=temp;
		//출력코드
		for(int val:spaces)
			System.out.println(val);
		
		
		//출력코드
		System.out.println("변수로 교환");
		int space1 = 24;
		int space2 = 25;
		System.out.println(space1);
		System.out.println(space2);
		System.out.println("exchanged!!");
		//교환코드
		temp = space1;
		space1 = space2;
		space2 = temp;
		//출력코드
		System.out.println(space1);
		System.out.println(space2);
	}
}
