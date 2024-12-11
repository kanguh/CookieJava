package com.cookie.day10.oop.inheritance;

import com.cookie.day10.oop.inheritance.point.Point;

class Super {
	public int pub; 		//전체 공개
	int def;				//같은 패키지 내 (팔로워만)
	protected int pro;		// 같은 패키지 + 상속한 자식클래스 (친한친구)
	private int pri;		// 외부로부터 차단	(나만보기)
}

class Sub extends Super{
	void set() {
		super.pub = 1;
		super.def = 2;
		super.pro = 3;
		//super.pri = 4;
		Super sup = new Super();
		sup.def = 502;
		sup.pub = 1118;
		//sup.pri = 101;
		sup.pro = 1225;
	}
}
class ShapePoint extends Point {
	void set() {
		Point p = new Point();
	}
}

public class Exam_Protected {

}
