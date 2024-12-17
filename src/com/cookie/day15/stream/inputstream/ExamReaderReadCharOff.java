package com.cookie.day15.stream.inputstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ExamReaderReadCharOff {
	public static void main(String[] args) {
		//read(char [] int, int)
		try {
			Reader reader = new FileReader("C:\\Windows\\system.ini");
			int readCount;
			char [] cBuf = new char[3];
			String result = "";
			while((readCount = reader.read(cBuf,0,3))!=-1) {
				result += new String(cBuf,0,readCount);
			}
			System.out.println(result);
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
