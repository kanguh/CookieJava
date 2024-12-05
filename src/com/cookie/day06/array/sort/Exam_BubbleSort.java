package com.cookie.day06.array.sort;

public class Exam_BubbleSort {
	public static void main(String[] args) {
		/*
		 * 버블정렬이란?
		 * 인접한 두개의 원소를 검사라여 정렬하는 방법
		 * 구현이 쉽다, 이미 정렬된 데이터를 정렬할때 가장 빠름
		 * 기본적으로 다른 정렬에 비해서 속도가 느린편, 역순으로 정렬할때 가장 느림.
		 */
		int [] arrs = {2,5,4,1,3};
		/*
		 * 0의 자리에는 i
		 * 1의 자리에는 i+1
		 * i가 0부터3까지 증가
		 */
		for(int j=4; j>0; j--) {
			for(int i=0; i<j; i++) {
				if(arrs[i]<arrs[i+1]) {
					int temp = arrs[i+1];
					arrs[i+1]=arrs[i];
					arrs[i]=temp;
				}
			}
		}
//			for(int i=0; i<4; i++) {
//			if(arrs[i]>arrs[i+1]) {
//				int temp = arrs[i+1];
//				arrs[i+1]=arrs[i];
//				arrs[i]=temp;
//				}
//			}
			for(int num:arrs)
				System.out.print(num+" ");
			
//		if(arrs[0]>arrs[1]) {
//			int temp = arrs[1];
//			arrs[1]=arrs[0];
//			arrs[0]=temp;
//		}else if(arrs[1]>arrs[2]){
//			int temp = arrs[2];
//			arrs[2]=arrs[1];
//			arrs[1]=temp;
//		}else if(arrs[2]>arrs[3]){
//			int temp = arrs[3];
//			arrs[2]=arrs[2];
//			arrs[2]=temp;	
//		}else if(arrs[3]>arrs[4]){
//			int temp = arrs[4];
//			arrs[4]=arrs[3];
//			arrs[3]=temp;
//		}else if(arrs[4]>arrs[5]){
//			int temp = arrs[5];
//			arrs[5]=arrs[4];
//			arrs[4]=temp;
//		}
	}
}
