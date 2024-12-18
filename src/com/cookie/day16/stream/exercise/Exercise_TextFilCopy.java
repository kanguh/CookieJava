package com.cookie.day16.stream.exercise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exercise_TextFilCopy {
	public static void main(String[] args) {
		Reader read = null;
		Writer write = null;
		
		try {
			read = new FileReader("C:\\Windows\\system.ini");
			write = new FileWriter("C:\\Temp\\system.txt");
			System.out.println("복사 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				read.close();
				write.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
