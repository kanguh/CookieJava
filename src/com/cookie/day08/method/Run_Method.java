package com.cookie.day08.method;

public class Run_Method {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam_Method em = new Exam_Method();
		em.noReturnNoParam();
		// 리턴형 X, 매개변수 X
		em. noReturnYesParam(20250220);
		// 리턴형 X, 매개변수 O
		System.out.println(em.yesReturnNoParam());
		// 리턴형 O, 매개변수 X
		int result = em.yesReturnYesParam(1000);
		// 리턴형 O, 매개변수 O
		System.out.println(result);
		
		result=em.sum(1,2,3,4,5);
		System.out.println("result : "+result);
	}
}
