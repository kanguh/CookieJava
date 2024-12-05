package com.cookie.day06.array.sort.exercise;

import java.util.Scanner;

public class Exercise_ArrySort {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum=0;
		int [] arrs = new int[5];
		for(int i=0; i<5; i++) {
			System.out.print(i+1+"번째 정수 입력 : ");
			int input = sc.nextInt();
			arrs[i]=input;
		}
		for(int j=4; j>0; j--) {
			for(int i=0; i<j; i++) {
				if(arrs[i]>arrs[i+1]) {
					int temp = arrs[i+1];
					arrs[i+1]=arrs[i];
					arrs[i]=temp;
				}
			}
		}
		System.out.print("정렬된 결과 : ");
		for(int num:arrs) {
			System.out.print(num+" ");
			sum=arrs[0]+arrs[4];
		}
		System.out.println();
		System.out.print("정렬 후 첫번째 수와 마지막수의 합 : "+sum);
	}
}

