package com.cookie.day16.stream.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class Exam_Write {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("src/com/cookie/day16/stream/io/TAA.txt");
			Writer fw = new FileWriter("src/com/cookie/day16/stream/io/MO.txt");
			
			byte [] byteArrs = "no.66 트렌트 알렉산더-아놀드".getBytes();
			os.write(byteArrs);
			os.flush(); 
			os.close();
			System.out.println("파일 쓰기 완료");
			
			fw.write("no.11 모하메드 살라");
			fw.flush();
			fw.close();
			System.out.println("파일 작성 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
