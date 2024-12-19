package com.cookie.day16.file;

import java.io.*;

public class Exam_File {
	public static void main(String[] args) {
		File folderMake = new File("src/com/cookie/day16/file/smaple");
		if(!folderMake.exists()) {
			folderMake.mkdir();
			System.out.println("폴더가 만들어짐");
		}else {
			System.out.println("폴더가 이미 있음");
		}
	}
	
	public void fileMakeEx() {
		File fileMake = new File("src/com/cookie/day16/file/ggg.txt");
		if(!fileMake.exists()) {
			// 파일이 없어서 만들어지면 만들었습니다. 출력
			// 파일 만드는 메소드
			try {
				fileMake.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 메시지 출력
			System.out.println("만들었음");
		}else {
			System.out.println("이미 있음");
		}
			
	}
	// 파일이 있으면  이미 있습니다. 출력
	
	
	public void fileBasic() {
		File file = new File("C:\\Temp\\copyimg.jpg");
		String fileName = file.getName();
		String path = file.getPath();
		String parent = file.getParent();
		System.out.println("파일 이름 : "+ fileName);
		System.out.println("파일 경로 : "+ path);
		System.out.println("파일 폴더 : " + parent);
		System.out.println("파일이 존재하는가? : "+file.exists());
		System.out.println("파일이 맞는가? : "+file.isFile());
		System.out.println("폴더가 맞는가? : "+file.isDirectory());
	}
}
