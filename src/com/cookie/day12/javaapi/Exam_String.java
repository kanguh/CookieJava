package com.cookie.day12.javaapi;

public class Exam_String {
	public static void main(String[] args) {
		String msg = "Hello";
		if("Hello" == msg)
			System.out.println("같음");
		String data = new String("Hello");
		if(msg == data)
			System.out.println("같음");
		else
			System.out.println("다름");
		
		System.out.println();
		// String 객체가 가지고 있는 유용한 메소드
		// 문자열 길이
		String data1 = new String(" C#");
		String data2 = new String(", C++ ");
		System.out.println(data1 + "의 길이"+ data1.length());
		System.out.println(data2 + "의 길이"+ data2.length());
		System.out.println();
		//문자열이 포함되어 있는지 체크
		System.out.println(data1 + "에 #이 있나? : "+ data1.contains("#"));
		data1 = data1.concat(data2);
		System.out.println("연결된 문자열 : "+data1);
		System.out.println();
		//문자열 공백 제거
		data1 = data1.trim();
		System.out.println("문자열 공백 제거"+ data1.length());
		System.out.println();
		//문자열 교체
		data1 = data1.replace("C#", "JAVA");
		System.out.println("문자열 교체 : " + data1);
		
		String [] words = data1.split(",");
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i]);
		}
		for(String word : words)
			System.out.println(word);
		System.out.println();
		//문자열 자르기 - 인덱스값을 기준으로 자르기
		System.out.println("ㅈ르기 전 : "+data1);
//		data1= data1.substring(0,4);
		data1= data1.substring(4);
		System.out.println("자르기 후 : " +data1);
		
		//문자열 -> 문자로 만들기
		char word = data1.charAt(0);
		System.out.println("문자열 -> 문자 : " + word);
	}
}
