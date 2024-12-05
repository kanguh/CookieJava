package com.cookie.day01.operator;

public class Exam_Unary {
	public static void main(String [] args) {
		/*
		 * 단항연산자
		 * a++, ++a -> a=a+1;
		 * a--, --a -> a=a-1;
		 * b++, ++b -> b=b+1;
		 * b--, --b -> b=b-1;
		 */
		int xx = 100;
		int yy= 33;
		int zz = 0;
		//System.out.println(--num); //num은 2가됨
		//System.out.println(++num); //+1 연산을 나중에 함. num은 여전히 2가됨
		//System.out.println(num);//num은 여기서 3이됨
		//num++, ++num, num ->1, 3, 3
		//num++, num++, num ->1, 2, 3
		//++num, ++num, num->2, 2, 3
		System.out.println(yy--+yy+++yy);
		/*
		 * 문제1
		 * a가 10, b는20, c는 30입니다.
		 * a++;
		 * b = (--a) + b;
		 * c = (a++) +(--b);
		 * a,b,c의 값은 얼마일까
		 * a=10, b=29, c=39
		 */
		int aNum=10;
		int bNum=20;
		int cNum=30;
		aNum++;
		bNum = (--aNum)+bNum;
		cNum=(aNum++)+(--bNum);
		/*
		 * 문제 2
		 * x는100, y는 33, z는0
		 * x--;
		 * z = x-- + --y
		 * x= 99 + x++ + x;
		 * y= y-- + y + ++y
		 * x,y,z는?
		 * x=300, y=99, z=132
		 */
		int x= 100;
		int y= 33;
		int z= 0;
		x--;
		z=x-- + --y;
		x= 99 + x++ + x;
		y = y-- + y + ++y;
		System.out.println(x+y+z);
		/*
		 * 문제3
		 * a=5, b=10,
		 * c=(++a) +b;
		 * 
		 */
	}
}
