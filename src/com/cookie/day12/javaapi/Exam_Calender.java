package com.cookie.day12.javaapi;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exam_Calender {
	public static void main(String[] args) {
		Calendar calender = new GregorianCalendar();
		Calendar today = Calendar.getInstance();
		Calendar startDate = Calendar.getInstance();
		startDate.set(2024,10,18);
		startDate.set(Calendar.HOUR_OF_DAY, 9);
		startDate.set(Calendar.MINUTE, 10);
		printDate("개강일", startDate);
		printDate("지금", today);
		// 지금은 2024/12/12/16시 31분 00초
		// 2024/11/18/화요일(9시) 오전 9시 00분 0초 0밀리초에 개강
		
//		System.out.println(today.get(Calendar.YEAR)+"년");
//		System.out.println((today.get(2)+1)+"월");
//		System.out.println(today.get(Calendar.DATE)+"일");
//		System.out.println(today.get(Calendar.HOUR)+"시");
//		System.out.println(today.get(Calendar.HOUR_OF_DAY)+"시");
//		System.out.println(today.get(Calendar.MINUTE)+"분");
//		System.out.println(today.get(Calendar.SECOND)+"초");
//		System.out.println(today.get(Calendar.MILLISECOND)+"초");
//		System.out.println(today.get(Calendar.AM_PM));
		
		
	}
	
	public static void printDate(String content, Calendar date) {
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH);
		int day = date.get(Calendar.DATE);
		int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
		int hour = date.get(Calendar.HOUR);
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		
		String dayWeek = " ";
		switch(dayOfWeek) {
			case Calendar.SUNDAY 	: dayWeek = "일요일"; break;
			case Calendar.MONDAY 	: dayWeek = "월요일"; break;
			case Calendar.TUESDAY 	: dayWeek = "화요일"; break;
			case Calendar.WEDNESDAY : dayWeek = "수요일"; break;
			case Calendar.THURSDAY 	: dayWeek = "목요일"; break;
			case Calendar.FRIDAY 	: dayWeek = "금요일"; break;
			case Calendar.SATURDAY 	: dayWeek = "토요일"; break;
		}
		System.out.println(content+"은 "+year+"/"+month+"/"+day+"/"+dayWeek+
							" "+hour+"시 "+minute+"분 "+second+"초");
	}
}
