package com.cookie.day16.file;

import java.io.*;

public class Exam_File2 {
	public static void main(String[] args) {
		/*
		 *  C:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg
		 */
		File file = new File("C:\\\\Windows\\\\Web\\\\Wallpaper\\\\Windows\\\\img0.jpg");
		
		System.out.println("파일명 : "+file.getName());
		System.out.println("파일용량 : "+file.length());
		System.out.println("상위폴더 : "+file.getParent());
		System.out.println("저장 절대 경로 : "+file.getAbsolutePath());
		System.out.println("저장 상대 경로 : "+file.getPath());
	}
}
