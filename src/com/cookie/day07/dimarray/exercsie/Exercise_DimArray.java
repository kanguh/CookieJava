package com.cookie.day07.dimarray.exercsie;

//기능용 클래스
public class Exercise_DimArray {
	public void practice1() {
		int k=1;
		int [][] arrs = new int[5][5];
		for(int i=0; i<5; i++) {
			for(int j=4; j>=0; j--) {
				arrs[i][j]=k;
				k++;
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%2d\t", arrs[i][j]);
			}
			System.out.println();
		}
	}
	public void practice2() {
		// 5 10 15 20 25
		// 4 9 14 19 24
		// 3 8 13 18 23
		// 2 7 12 17 22
		// 1 6 11 16 21
		int [][] arrs = new int[5][5];
		int k=1;
		for(int i=0; i<5; i++) {
			for(int j=4; j>=0; j--) {
				arrs[j][i]=k;
				k++;
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%2d\t", arrs[i][j]);
			}
			System.out.println();
		}
	}
	public void practice3() {
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25
		
		int [][] arrs = new int[5][5];
		int k=1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arrs[j][i]=k;
				k++;
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%2d\t", arrs[i][j]);
			}
			System.out.println();
		}
	}
	public void practice4() {
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25
		int [][] arrs = new int[5][5];
		int k=1;
		for(int i=0;i<5;i++) {
			if(i%2==0) {
				for(int j=0; j<5; j++) {
				arrs[i][j]=k;
				k++;//1~25까지 증가
				}
			}else {
				for(int j=4; j>=0; j--) {
				arrs[i][j]=k;
				k++;
				}
			}	
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%2d\t", arrs[i][j]);
			}
			System.out.println();
		}
	}
}

