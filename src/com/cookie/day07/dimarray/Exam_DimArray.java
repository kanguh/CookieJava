package com.cookie.day07.dimarray;

public class Exam_DimArray {
	public static void main(String[] args) {
		int num = 0;
		int [] nums =new int[10];
		int [][] dimNums = new int[5][15];
		//12345
		//67890
		//1112131415
		//1617181920
		//2122232425
		int k=1;
		for(int i=0;i<5;i++) {
			for(int j=0; j<5; j++) {
				dimNums[i][j]=k;
				k++;//1~25까지 증가
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%2d\t", dimNums[i][j]);
			}
			System.out.println();
		}
		
//		//#1번째 행
//		for(int j=0; j<5; j++) {
//			dimNums[0][j]=j+1;
//		}
////		dinNums[0][1]=1;
////		dinNums[0][2]=2;
////		dinNums[0][3]=3;
////		dinNums[0][4]=4;
////		dinNums[0][5]=5;
//		
//		//#2번째 행
//		for(int j=0; j<5; j++) {
//			dimNums[1][j]=j+5;
//		}
////		dinNums[1][0]=6;
////		dinNums[1][1]=7;
////		dinNums[1][2]=8;
////		dinNums[1][3]=9;
////		dinNums[1][4]=10;
//		
//		//#3번째 행
//		for(int j=0; j<5; j++) {
//			dimNums[2][j]=j+11;
//		}
////		dinNums[2][0]=11;
////		dinNums[2][1]=12;
////		dinNums[2][2]=13;
////		dinNums[2][3]=14;
////		dinNums[2][4]=15;
	}
}
