package com.cookie.day16.stream.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Exam_Exception2 {
	public static void main(String[] args) {
		try {
			readFile();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void readFile() throws FileNotFoundException {
		/*
		 * FileReader를 쓸때는 파일이 없는 경우를 대비해야함
		 * 자바에서는 TRY~CATCH를 통해서 예외처리를함
		 * 그런데 파일이 없는 경우를 대비하는것을 회피하는 방법이 있ㅇ믐
		 * 바로 throws 로 발생 할 수있는 예외를 회피하여 try~catch 를 안써도됨
		 * 그럼 try~catch는 어디선간 해주어야함 
		 * main메소드를 보면 main 메소드는 FileReader를 가지고 
		 * 객체를 생성하는 readFile 메소드를 호출하고 있음
		 * 호출하면 회피된 예외를 처리해주어야 함
		 * 그래서 try~catch가 main에 있는 것임
		 */
		Reader reader = new FileReader("C:\\Windows\\system.ini");
//		try {
//			Reader reader = new FileReader("C:\\Windows\\system.ini");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
	}
}
