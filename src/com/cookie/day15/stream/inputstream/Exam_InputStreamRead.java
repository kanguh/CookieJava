package com.cookie.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_InputStreamRead {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\Windows\\system.ini");
			int readByte;
			// while 문으로
			while((readByte = is.read()) !=-1) {
				System.out.print((char)readByte);
			}
			while(true) {
				readByte = is.read();
				if(readByte == -1) break;
				System.out.print((char)readByte);
			}
			// do ~ while 문으로
			do {
				readByte = is.read();
				System.out.print((char)readByte);
			}while(readByte != -1);

			// for 문으로
			for(; ;) { // 다 읽을때까지 시행 --> is.read() == -1
				readByte = is.read();
				if(readByte == -1) break;
				System.out.print((char)readByte);
			}
			is.close();
//			is.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
