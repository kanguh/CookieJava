package com.cookie.day18.thread;

class CountUpRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() +" : "+i);
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
class CountDownRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=69; i>=65; i--) {
			System.out.println(Thread.currentThread().getName() +" : "+(char)i);
			try {
				Thread.sleep(510);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Exam_ThreadRunnable {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new CountUpRunnable(), "숫자 스레드");
		Thread thread2 = new Thread(new CountDownRunnable(), "알파벳 스레드");
		thread1.start();
		thread2.start();
	}
}
