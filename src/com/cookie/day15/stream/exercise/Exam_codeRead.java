package com.cookie.day15.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam_codeRead {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("src/com/cookie/day15/stream/inputstream/Exam_InputStreamReadByteOff.java");
			int readData;
			while((readData = fr.read()) != -1) {
				System.out.print((char)readData);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
