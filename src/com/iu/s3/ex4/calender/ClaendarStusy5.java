package com.iu.s3.ex4.calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClaendarStusy5 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		//카카오택시
		//30분 소요 예정
		//도착 예정 시간은
		//1000*60*30
		System.out.println(ca.getTime());
		long time = ca.getTimeInMillis();
		time = time+1000*60*30;
		
		ca.setTimeInMillis(time);
		System.out.println(ca.getTime());
		
		ca.roll(Calendar.MINUTE, 70);
		System.out.println(ca.getTime());
		
		ca.add(Calendar.MINUTE,70);
		System.out.println(ca.getTime());
		//2022년 01월 14일 - 16: 44: 11
		String Pattern = "YYYY년MM월DD일 - HH:mm:ss";
		
		SimpleDateFormat sd = new SimpleDateFormat(Pattern);
		String r = sd.format(ca.getTime());
		System.out.println(r);
		
		Pattern = "yyyy-MM-dd(E)";
		sd.applyPattern(Pattern);
		
		System.out.println(sd.format(ca.getTime()));
	}

}
