package com.cookie.day06.array.sort;

public class Exam_IsertionSort {
	public static void main(String[] args) {
		/*
		 * 삽입정렬
		 */
		int arrs[]= {2,5,4,1,3};
		for(int j=1; j<arrs.length; j++) {
			for(int i=j; i>0; i--) {
				if(arrs[i-1]>arrs[i]) {
				int temp = arrs[i];
				arrs[i]=arrs[i-1];
				arrs[i-1]=temp;
				}
			}
		}
		for(int num:arrs) {
			System.out.print(num+" ");
		}
		// 작동원리
		
//		//#1
//		if(arrs[0]>arrs[1]) {
//			int temp = arrs[1];
//			arrs[1]=arrs[0];
//			arrs[0]=temp;
//		}
		
//		//#2
//		if(arrs[1]>arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		
//		if (arrs[0]>arrs[1]) {
//			int temp = arrs[0];
//			arrs[0]=arrs[1];
//			arrs[1]=temp;
//		}
		
//		//#3
//		if (arrs[2]>arrs[3]) {
//			int temp = arrs[3];
//			arrs[3]=arrs[2];
//			arrs[2]=temp;
//		}
//		if(arrs[1]>arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		
//		if (arrs[0]>arrs[1]) {
//			int temp = arrs[0];
//			arrs[0]=arrs[1];
//			arrs[1]=temp;
//		}
		
//		//#4
//		if (arrs[3]>arrs[4]) {
//			int temp = arrs[4];
//			arrs[4]=arrs[3];
//			arrs[3]=temp;
//		}
//		if (arrs[2]>arrs[3]) {
//			int temp = arrs[3];
//			arrs[3]=arrs[2];
//			arrs[2]=temp;
//		}
//		if(arrs[1]>arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//				
//		if (arrs[0]>arrs[1]) {
//			int temp = arrs[0];
//			arrs[0]=arrs[1];
//			arrs[1]=temp;
//		}
	}
}
