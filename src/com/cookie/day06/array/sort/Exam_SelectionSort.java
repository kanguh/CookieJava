package com.cookie.day06.array.sort;

public class Exam_SelectionSort {
	public static void main(String[] args) {
		/*
		 * 선택정렬이란?
		 * 배열을 전부 검색하여 최소값으 ㄹ고르고 왼쪽부터 채워나가는 정렬
		 * 데이터의 양이 적을때 좋은 성능을 보여준다
		 * 데이터의 양이 많을때 급격한 성능 저하
		 */
		int [] arrs = {2,5,4,1,3};
		for(int i=0; i<arrs.length; i++) {
			int min=i;
			for(int j=i+1; j<arrs.length; j++) {
				if(arrs[min]<arrs[j]) {
					min=j;
				}
			}
			int temp=arrs[i];
			arrs[i]=arrs[min];
			arrs[min]=temp;
		}
		for(int num:arrs) {
			System.out.print(num+" ");
		}
	}
}
