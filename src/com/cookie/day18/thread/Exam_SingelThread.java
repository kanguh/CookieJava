package com.cookie.day18.thread;

public class Exam_SingelThread {
	public static void main(String[] args) { // main 메소드도 스레드
		// 싱글 스레드의 경우 순차적으로 실행
		// - 한 작업이 완전히 끝나야 다음 작업 시작
		printNumbers(); // 숫자 출력
		downLoadFiles(); // 파일 다운로드
	}

	private static void downLoadFiles() {
		for(int i=0; i<=5; i++) {
			System.out.println("숫자 : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private static void printNumbers() {
		String [] files = {"document.pdf", "image.pdf", "video.mp5"};
		for(String file : files) {
			System.out.println(file + " 다운로드중 . . .");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
