package com.cookie.day18.thread;

class CountUp extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(i+1);
			try {
				Thread.sleep(500);
				// 전달값으로 밀리초를 받음, 1ms = 1/1000초, 1000ms = 1초
				// 반드시 예외처리를 해줘야함
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}
}

class CountDown extends Thread{
	@Override
	public void run() {
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
public class Exam_Thread2 {
	public static void main(String[] args) {
		CountUp up = new CountUp();
		up.start();
		CountDown down = new CountDown();
		down.start();
	}
}
