package com.iu.s3.ex2;

import java.util.Scanner;

public class StudentData {
	
	private String info;
	private Scanner sc;
	
	public StudentData() {
		this.info="name1,1,15,50,60,";
		this.info=this.info+"name2,2,30,55,65,";
		this.info=this.info+"name3,3,40,60,75,";
		System.out.println(this.info);
	}
	
	//학생의 정보를 파싱해서 총점과 평균도 계산 후 전체 출력
	//학생의 정보를 추가
		public void StudnetGrade() {
			StudentDTO studentDTO = new StudentDTO();
			int count = sc.nextInt();
			StudentDTO [] students = new StudentDTO[count];
			System.out.println("학생수를 입력하세요");
			
			System.out.println("학생수 : " + count+ "명");
			for(int i=0; i<students.length;i++) {
				System.out.println("학생의 이름을 입력해 주세요");
				studentDTO.setName(sc.next());
				System.out.println("학생의 번호를 입력해 주세요");
				studentDTO.setNum(sc.nextInt());
				System.out.println("국어점수를 입력해 주세요");
				studentDTO.setKor(sc.nextInt());
				System.out.println("영어점수를 입력해 주세요");
				studentDTO.setEng(sc.nextInt());
				System.out.println("수학점수를 입력해 주세요");
				studentDTO.setMath(sc.nextInt());
				
				
				
			}
			
		}
}
