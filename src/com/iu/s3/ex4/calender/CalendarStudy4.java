package com.iu.s3.ex4.calender;

import java.util.Calendar;

public class CalendarStudy4 {

	public static void main(String[] args) {
		//현재 시간
		Calendar ca = Calendar.getInstance();
		//내가 태어난날//1990 3 29
		Calendar ca2 = Calendar.getInstance();
		ca2.set(1994,2,29);
		System.out.println(ca2.getTime());
		
		long l1 = ca.getTimeInMillis();
		
		long l2 = ca2.getTimeInMillis();
		
		long result = l1-l2;
		
		System.out.println(result/(1000*60*60*24));
		System.out.println(result/(1000*60*60*24*365.2425));
		//며칠
		
		//나이

	}

}
