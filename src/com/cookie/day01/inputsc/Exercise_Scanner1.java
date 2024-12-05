package com.cookie.day01.inputsc;

import java.util.Scanner;

public class Exercise_Scanner1 {
	public static void main(String [] args) {
		/*
		 * 이름, 도시, 나이, 체중, 독신 여부를 빈칸에 분리하여 입력받으세요
		 * kim Seoul 20 65.1 true
		 * 이름은 Kim 도시는 seoul, 나이는 20 살, 체중은 65.1kg 독신 여부는 true
		 * 
		 */
		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력해주세요 : " );
		String name = sc.next();
//		System.out.print("도시를 입력해주세요 : " );
		String city = sc.next();
//		System.out.print("나이를 입력해주세요 : " );
		int age = sc.nextInt();
//		System.out.print("몸무게를 입력해주세요 : " );
		double weight = sc.nextDouble();
//		System.out.print("독신여부 : " );
		boolean solo = sc.nextBoolean();
//		System.out.println("이름은 "+ name +", 도시는 " + city +
//						", 나이는 "+ age +"살, 몸무게는 "+ weight+"kg"
//							+", 독신여부는 "+solo+"입니다.");
		System.out.printf("이름은 %s, 도시는 %s, 나이는 %d살 체중은 %fkg, 독신여부는 %b입니다.\n"
						, name, city, age, weight, solo);
	}
}
