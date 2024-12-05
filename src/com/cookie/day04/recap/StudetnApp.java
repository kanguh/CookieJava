package com.cookie.day04.recap;

import java.util.Scanner;

public class StudetnApp {
	public static void main(String[] args) {
//		int menu = 0;
//		int score1 = 0;
//		int score2 = 0;
//		int score3 = 0;
//		while(menu!=3){
//			Scanner sc = new Scanner(System.in);
//			System.out.println("====== 메인 메뉴 ======");
//			System.out.println("1. 성적입력");
//			System.out.println("2. 성적출력");
//			System.out.println("3. 종료");
//			System.out.print("선택 >> ");
//			menu = sc.nextInt();
//			if(menu==1) {
//				System.out.println("====== 성적 입력 ======");
//				System.out.print("국어 : ");
//				score1 = sc.nextInt();
//				System.out.print("영어 : ");
//				score2 = sc.nextInt();
//				System.out.print("수학 : ");
//				score3 = sc.nextInt();
//			}else {
//				if(menu==2){
//					int total = (score1+score2+score3);
//					double average = (score1+score2+score3)/3;
//					System.out.println("====== 성적 출력 ======");
//					System.out.println("국어 : "+ score1);
//					System.out.println("영어 : " + score2);
//					System.out.println("수학 : " + score3);
//					System.out.println("총점 : " + total);
//					System.out.println("평균 : " + average);
//				}
//			}
//		}
//		System.out.println("프로그램이 종료되었습니다.");
		Scanner sc = new Scanner(System.in);
		
		//무한 반복을 위한 반복문
		// 1. for(;;) {}
		// 2. while(true) {}
			
			//int kor = 0; --> 일반적인 변수 선언
			//int eng = 0;
			//int math = 0;
			int score [] = new int [3]; // 배열문 사용
			while(true) {
				System.out.println("====== 메인 메뉴 ======");
				System.out.println("1. 성적입력");
				System.out.println("2. 성적출력");
				System.out.println("3. 종료");
				System.out.print("선택 >> ");
				int menu = sc.nextInt();
			switch(menu) {
				case 1 : 
					System.out.println("====== 성적 입력 ======");
					System.out.print("국어 : ");
					score[0] = sc.nextInt();
					System.out.print("영어 : ");
					score[1] = sc.nextInt();
					System.out.print("수학 : ");
					score[2] = sc.nextInt();
					break;
				case 2 :
					System.out.println("====== 성적 출력 ======");
					System.out.println("국어 : "+ score[0]);
					System.out.println("영어 : " + score[1]);
					System.out.println("수학 : " + score[2]);
					System.out.println("총점 : " + (score[0]+score[1]+score[2]));
					System.out.println("평균 : " + (score[0]+score[1]+score[2])/(double)3);
					break;
				case 3 :
					System.out.println("프로그램이 종료되었습니다.");
					return;
			}
		}
	}
}


