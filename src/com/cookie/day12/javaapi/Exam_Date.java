package com.cookie.day12.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {
	public static void main(String [] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss:SS");
		//========== 권장사함 ==========
		Calendar calender = new GregorianCalendar();
		System.out.println(calender.getTime());
		
		
		
		
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		String transDate1 = sdf3.format(date);
		System.out.println(transDate1);
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyy-mm-dd HH:mm:ss:SS");
		String transDate2 = sdf4.format(date);
		System.out.println(transDate2);
	}
}
