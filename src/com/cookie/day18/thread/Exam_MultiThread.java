package com.cookie.day18.thread;

class PrintNumbers implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("숫자 : "+(i+1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class DownloadFiles implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
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

public class Exam_MultiThread {
		/*
		 * printNumbers 와 downloadFiles 를 스레드로 만들어서 실행
		 */
	public static void main(String[] args) {
		Thread printNumber = new Thread(new PrintNumbers());
		Thread downloadFiles = new Thread(new DownloadFiles());
		printNumber.start();
		downloadFiles.start();
	}
}

