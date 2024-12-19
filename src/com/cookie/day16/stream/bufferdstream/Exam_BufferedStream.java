package com.cookie.day16.stream.bufferdstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_BufferedStream {
	public static void main(String[] args) {
		Reader reader = null;
		BufferedReader bReader = null;
		
		try {
			reader = new FileReader("src/com/cookie/day16/stream/exercise/Exercise_TextFilCopy.java");
			bReader = new BufferedReader(reader); // 보조스트림 객체 생성시 주스트림을 전달해주어야함
			int readeCount;
			for(int i=0; i<5; i++)
			System.out.println(bReader.readLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close();
				bReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
