package com.cookie.day05.array.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice_Array1 {
	public static void practice1() {
		//System.out.println("practice1");
		/*
		 * 길이가 10인 배열
		 * 1부터 10까지 값
		 * 반복문을 이용하여 순서대로 저장하고 출력
		 */
		int [] arrs;
		arrs = new int[10];
		for(int i=0; i<10; i++) {
			arrs[i] = (i+1);
		}
		for(int i=0; i<10; i++) {
			System.out.print(arrs[i]+ " ");
		}
	}
	public static void practice2() {
		int [] arrs;
		arrs = new int[10];
		for(int i=0, count=10; i<10; i++,count--) 
			arrs[i]=count;
		for(int i=0; i<10; i++) 
			System.out.print(arrs[i]+ " ");
		
	}
	public static void practice3() {
		Scanner sc= new Scanner(System.in);
		System.out.print("양의정수 : ");
		int input=sc.nextInt();
		int [] nums = new int[input];
		for(int i=0; i<input; i++) {
			nums[i]=(i+1);
			System.out.print(nums[i]+" ");
		}
	}
	public static void practice4() {
		/*
		 * 길이가 5인 String 배열 선언
		 * 사과, 귤, 포도, 복숭아, 참외 순서대로 저장
		 * 배열 인덱스를 사용하여 귤 출력
		 */
		String fruits[];
		fruits=new String[5];
		fruits[0] = "사과";
		fruits[1] = "귤";
		fruits[2] = "포도";
		fruits[3] = "복숭아";
		fruits[4] = "참외";
		System.out.println(fruits[1]);
		for(int i=0; i<fruits.length; i++)
			System.out.print(fruits[i]+ " ");
	}
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String word = sc.next();
		char [] letters = new char[word.length()];
		for(int i=0; i<word.length(); i++)
			letters[i]=word.charAt(i);
		System.out.print("문자 : ");
		char input =sc.next().charAt(0);
		for(int i=0; i<word.length(); i++)
			if(letters[i]==input)
			System.out.print((i+1)+" ");
		System.out.println();
		int count=0;
		for(int i=0; i<word.length(); i++)
			if(letters[i]==input)
			count++;
			System.out.println(count+"개");
	}
	public static void practice6() {
		Scanner sc = new Scanner(System.in);
		String days[] ={"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		System.out.print("0~6사이의 숫자 입력 : ");
		int num=sc.nextInt();
		if(num<=6)
		System.out.print(days[num]);
		else 
			System.out.println("0~6사이의 정수를 입력해주세요");
	}
	public static void practice7() {
		Scanner sc= new Scanner(System.in);
		int value = 0;
		int sum = 0;
		System.out.print("정수 : ");
		int input=sc.nextInt();
		int [] nums = new int[input];
		for(int i=0; i<input; i++) {
			System.out.print("베열"+(i+1)+"번째 인덱스에 넣을 값 : ");
			value = sc.nextInt();
			nums[i]=(value);
			sum += value;
		}
		for(int i=0; i<input; i++) {
		}
		System.out.println();
		System.out.println("총합 : "+sum);
	}
	public static void practice8() {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 : ");
			int input=sc.nextInt();
			if(input%2!=0) {
				int [] nums = new int[input];
				for(int i=1; i<=(input/2)+1; i++) {
					nums[i]=i;
					System.out.print(nums[i]+" ");
				}
				for(int i=(input/2); i>=1; i--) {
					nums[i]=i;
					System.out.print(nums[i]+ " ");
				}
				break;
			}else {
				System.out.println("다시입력하세요");
			}
		}
	}
	public static void practice9() {
		
	}
	public static void practice10() {
		
	}
	public static void practice11() {
		int [] lotto = new int[6];
		Random rand = new Random();
		for(int i=0; i<lotto.length; i++) {
			//1~45사이의 랜덤한 숫자 출력
			//System.out.print((rand.nextInt(45)+1)+" ");
			//배열안에넣기
			lotto[i]=rand.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
		}
		for(int j=0; j<(lotto.length+1); j++) {
			for(int i=0; i<(lotto.length-1)-j; i++) {
				if(lotto[i]>lotto[i+1]) {
					int temp=lotto[i];
					lotto[i]=lotto[i+1];
					lotto[i+1]=temp;
				}
			}
		}
		for(int lottos:lotto) {
			System.out.print(lottos+" ");
		}
	}
	public static void practice12() {
		
	}
}
