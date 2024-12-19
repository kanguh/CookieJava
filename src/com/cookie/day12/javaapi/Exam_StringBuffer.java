package com.cookie.day12.javaapi;

public class Exam_StringBuffer {
	public static void main(String[] args) {
		String data1 = "Hello";
		String data2 = " ";
		String data3 = "JAVA";
		//문자열 연결하여 Hello JAVA 출력
		
		data2 = data2.concat(data3);
		data1 = data1.concat(data2);
		System.out.println(data1);
		System.out.println();
		
		StringBuffer stb = new StringBuffer();
		stb.append("Hello").append(" ").append("JAVA");
		System.out.println("연결 : "+stb.toString());
		stb.reverse();
		System.out.println("연결 : "+stb.toString());
	}
}
