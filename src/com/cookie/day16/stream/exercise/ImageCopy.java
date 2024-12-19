package com.cookie.day16.stream.exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ImageCopy {
	
	
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			//입력스트림을 사용해서 읽기
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg");
			os = new FileOutputStream("C:\\Temp\\copyimg.jpg");
			int readCount;
			byte [] readBytes = new byte[1024];
			while(true) {
				readCount = is.read(readBytes);
				if(readCount ==-1) break;
				//읽은 내용 목적지에 저장하기
				os.write(readBytes,0,readCount);
				//flush
				os.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				os.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
