package com.iu.s1.lang.string;

import java.util.Scanner;

public class StringStudy1 {
	
	public void splitTest() {
		String name = "춘식,iu,suji,choa";
		String [] names = name.split(",");
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i].trim());
			
		}

	}
	
	public void valueTest() {
		int num = 1000;
		String result = String.valueOf(num);
		System.out.println(result);
		
	}
	
	
	public void caseTest() {
		String title = "West Side Story";
		String result = title.toLowerCase();
		String result2 = title.toUpperCase();
		System.out.println(title);
		System.out.println(result);
		System.out.println(result2);
	}
	
	public void replaceTest() {
		String title = "West Side Story";
		//참조변수명.멤버메서드명()
		String result = title.replace('S','t');
		System.out.println(title);
		System.out.println(result);
	}
	
	public void subStringEx1() {
		//키보드로부터 업로드할 파일명을 입력
		//a.txt, b.pdf, iu.jpg
		//jpg, gif, png -> 이미지 파일입니다 출력
		//txt, pdf, hwp -> 문서 파일입니다 출력
		//mp3, wav, ogg -> 음원 파일 입니다 출력
		// 나머지는 알 수 없는 파일입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 입력");
		String fileName = sc.next();
		String result = fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println(result);
		
		if(result.equals("jpg")||result.equals("gif")||result.equals("png")){
			System.out.println("이미지 파일입니다.");
		}else if (result.equals("txt")||result.equals("pdf")||result.equals("hwp")) {
			System.out.println("문서 파일입니다.");
		}else if (result.equals("mp3")|| result.equals("wav")||result.equals("ogg")) {
			System.out.println("음원 파일 입니다.");
		}else {
			System.out.println("알수없는 파일입니다");
		}
				
				
			
			
		}
		
		
		
	
	
	public void subStringTest() {
		String title = "West Side Story";
		String result = title.substring(title.indexOf("i"));
		System.out.println(result);
		result = title.substring(5,8);
		System.out.println(result);
	}
	
	public void lengthTest() {
		String title = "West Side Story";
		int len = title.length();
		System.out.println(len);
		char [] ch = {'W','e','s','t'};
		
		String find="e";
		//title find에 들어가있는 글자 몇개 인지 출력
		int count=0;
		for(int i=0;i<title.length();i++) {
			int index = title.indexOf(find,i);
			if(index >=0) {
				count++;
				i=index;
			}else {
				break;
			}
		}
		System.out.println("Count : "+count);
		//한글자씩 출력
		//W
		//e
		//s
//		for(int i=0;i<title.length();i++) {
//			System.out.println(title.charAt(i));
//		}
	}
	
	public void indexOfTest() {
		String msg = "Hello World";
		//reference, 지역변수, 참조변수
		//indexof 호출
		int num = msg.indexOf("o",7+1);//int ch = 'W';
		System.out.println(num);
	}
	
	public void equalTset() {
		String str="iu";
		String str2="iu";
		String str3 = new String("iu");
		String str4 = new String("iu");
		
		System.out.println(str==str2);
		System.out.println(str3 == str4);
		System.out.println(str==str3);
		System.out.println("================================");
		System.out.println(str.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str.equals(str3));
	}
	
	
	public void study1() {
		String name = "hello";
		
		//charAt 메서드 호출 코드 잓성
		int i =2;
		char ch = name.charAt(i);
		System.out.println(ch);
		
		//System.out.println(name);
		
		
		//String name2 = new String("hello2");
		
	
		
	}

}
