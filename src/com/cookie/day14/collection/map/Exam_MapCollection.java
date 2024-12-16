package com.cookie.day14.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam_MapCollection {
	public static void main(String[] args) {
		/*
		 * 전화번호부에서 지역번호를 검색하면 출려해주는 프로그램
		 */
		Scanner sc = new Scanner(System.in);
		Map<String, String> phoneMap = new HashMap<String, String>();
		phoneMap.put("02", "서울");
		phoneMap.put("031", "경기도");
		phoneMap.put("032", "인천");
		phoneMap.put("033", "강원도");
		phoneMap.put("051", "부산");
		phoneMap.put("052", "울산");
		phoneMap.put("053", "대구");
		String localNum = "";
		do {
			System.out.print("지역번호 입력 : ");
			localNum = sc.next();
			
//		System.out.println("저장된 데이터 수 : "+phoneMap.size());
//		System.out.println("02를 누르면 : "+phoneMap.get("02"));
//		System.out.println("031을 누르면 : "+phoneMap.get("031"));
			String result = phoneMap.get(localNum);
			if(result!=null) {
				System.out.println("검색하신 지역은 : "+result);
			}else {
				System.out.println("데이터가 존재하지 않습니다");
			}
	}while(!"exit".equals(localNum));
//		switch(localNum) {
//		case "02" : System.out.println("서울"); break;
//		case "031" : System.out.println("경기도"); break;
//		}
	}
}
