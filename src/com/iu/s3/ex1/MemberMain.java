package com.iu.s3.ex1;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		
		MemberData memberData= new MemberData();
		ArrayList<MemberDTO> members = memberData.init();
		
		for(int i=0;i<members.size();i++) {
			System.out.println(members.get(i).getId());
			System.out.println(members.get(i).getName());
			System.out.println(members.get(i).getPw());
			System.out.println(members.get(i).getEmail());
			System.out.println(members.get(i).getAge());
			System.out.println("============================");
		}
		
		System.out.println("name : " + "iu" + "age : " + 30 );
	
	}

}
