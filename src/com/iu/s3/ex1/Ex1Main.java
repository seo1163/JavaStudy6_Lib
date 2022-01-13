package com.iu.s3.ex1;

import java.util.ArrayList;
import java.util.Map;

import com.iu.s3.ex1.member.MemberDTO;
import com.iu.s3.ex1.member.MemberData;
import com.iu.s3.ex1.student.StudentDTO;
import com.iu.s3.ex1.student.StudentData;



public class Ex1Main {

	public static void main(String[] args) {
		MemberData memberData = new MemberData();
		StudentData studentData = new StudentData();

		//회원들의 정보 모음
		ArrayList<MemberDTO> ar = memberData.init();
		Map<String, StudentDTO> map = studentData.addStudent(ar);
		System.out.println(map);
	}

}
