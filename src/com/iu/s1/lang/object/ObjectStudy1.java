package com.iu.s1.lang.object;

public class ObjectStudy1 {

	//생성자가 없음 기본 생성자를 만들어줌
	//기본생성자는 매개변수가 없는 생성자
	
	public void study1() {
		System.out.println("Study1 실행");
		
		//object 객체를 생성하고 참조 주소를 출력
		
		Object obj = new Object();
		System.out.println(obj);
		//clone 호출
		//참조변수명.멤버
		int num = obj.hashCode();
		System.out.println(num);
	
		String str = obj.toString();
		System.out.println(str);
	}
	
	
	
}
