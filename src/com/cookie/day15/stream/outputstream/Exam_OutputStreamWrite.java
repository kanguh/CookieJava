package com.cookie.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_OutputStreamWrite {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("src/com/cookie/day15/stream/outputstream/writing.txt");
			os.write(65);
			os.write(66);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
