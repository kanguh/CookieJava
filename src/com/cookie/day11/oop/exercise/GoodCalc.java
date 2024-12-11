package com.cookie.day11.oop.exercise;

import java.util.Scanner;

public class GoodCalc extends Calculator {
Scanner sc = new Scanner(System.in);
	@Override
	public int add(int a, int b) {
//		System.out.println(">>");
//		a = sc.nextInt();
//		b = sc.nextInt();
		int result = a+b;
		return result;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double avg(int[] a) {
		// TODO Auto-generated method stub
		//int [] a = new int[5];
		//평균 = 합 / 크기
		// 합 : 배열에 있는 값을 꺼내서 더해 (누적합)
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		double avg = (double)sum/ a.length;
		return avg;
	}

	public static void main(String[] args) {
		
		Calculator calculator = new GoodCalc(); // -->동적바인딩
		System.out.println(calculator.add(11,18));
		System.out.println(calculator.subtract(11,18));
		int [] arrs = {11, 18, 25, 12};
		System.out.println(calculator.avg(arrs));
		
		
		GoodCalc calc = new GoodCalc();
		System.out.println(calc.add(11,18));
		System.out.println(calc.subtract(11,18));
		int [] nums = {11, 18, 25, 12};
		System.out.println(calc.avg(nums));
//		calc.add(11,18);
	}
}
