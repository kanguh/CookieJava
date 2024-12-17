package com.cookie.day15.stream.inputstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam_ReaderRead {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Windows\\system.ini");
			int readData;
			while((readData = fr.read()) != -1) {
				System.out.print((char)readData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
