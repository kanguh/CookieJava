package com.cookie.day16.stream.exercise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exercise_TextFilCopy {
	public static void main(String[] args) {
		/*
		 * 파일을 복사
		 * C드라이브 밑 Windows 폴더 밑에 system.ini파일을 복사
		 * main 메소드를 기준으로 생각했을 때 해당 파일을 읽어야 하기 대문에 입력스트림을 사용
		 * 목적지 파일에 서야함
		 * main 메소드를 기준으로 내용을 내보내야함
		 * 출력스트림 사용 읽은 내용 파일에 저장
		 */
		Reader reader = null;
		Writer writer = null;
		
		try {
			reader = new FileReader("C:\\Windows\\system.ini");
			writer = new FileWriter("C:\\Temp\\system.txt");
			int readCount;
			char [] cBuf = new char[1024];
			while(true) {
				readCount = reader.read(cBuf);
				if(readCount == -1) break;
				writer.write(cBuf, 0, readCount);
				writer.flush();
			}
			System.out.println("복사 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
