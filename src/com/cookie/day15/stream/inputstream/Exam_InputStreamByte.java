package com.cookie.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_InputStreamByte {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\Windows\\system.ini");
			int readByte;
			byte [] readBytes = new byte[3];
			String result ="";
			while((readByte = is.read(readBytes)) != -1) {
				//읽은  갯수 출력
				//readByte는 읽은 값을 가지고 있음
				//나는 문자열로 출력해야함
				//바이트 배열 -> 스트링으로 변환되야함
				//"1" --> 1, Integer.parsrInt("1")
				result+=new String(readBytes, 0 , readByte);
			}
			System.out.println(result);
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
