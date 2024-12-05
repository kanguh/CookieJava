package com.cookie.day05.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {
	public static void main(String[] args) {
		/*
		 * 	배열의 length 필드를 이용하여 배열의 크기만큼 정수를 입력받고 
		 * 평균을 구하는 프로그램
		 * 배열의 크기는 5
		 */
		Scanner sc = new Scanner(System.in);
		//System.out.println(nums.length);
		int nums[];
		nums = new int[5];
		int sum=0;
		System.out.print("정수 5개 입력 : ");
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
			sum+=nums[i];
		}
		double avg = sum/(double)5;
		System.out.println("평균 : "+avg);
	}
}
