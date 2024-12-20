package com.cookie.day18.thread;

public class Exam_Thread1 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
				// 전달값으로 밀리초를 받음, 1ms = 1/1000초, 1000ms = 1초
				// 반드시 예외처리를 해줘야함
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		for(int i=69; i>=65; i--) {
			System.out.println((char)i);
			try {
				Thread.sleep(510);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
