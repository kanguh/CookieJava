package com.cookie.day05.array;

public class Exam_DeepCopy {
	public static void main(String [] args) {
		int origins [] = {24,11,18,25,5,2};
		//깊은복사 원본과 사본 분리
		int copied []=new int[6];
		//for(int i=0; i<copied.length; i++) 
		int k = 0;
		for(int value:origins) {
			copied[k]=value;
			k++;
		}
		copied[0]=56;
		origins[3]=35;
		for(int i=0; i<copied.length; i++) 
			System.out.print(copied[i]+ " ");
		System.out.println();
		for(int num:copied)
			System.out.print(num+" ");
		System.out.println();
		for(int i=0; i<copied.length; i++)
			System.out.print(origins[i]+" ");
		System.out.println();
		for(int num:origins)
			System.out.print(num+" ");
		System.out.println();
	}
}
