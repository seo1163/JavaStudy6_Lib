package com.iu.s2.util.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListStudy {
	private final int NUM=4;
	
	public List<String> study5() {
		LinkedList<String> list = new LinkedList<>();
		list.add("1");
		return list;
	}
	
	
	public void study4() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
	}
	
	
	public void study3() {
		//123
		//generic
		//ArrayList<E> 변수명 = new ArrayList<E>();
		//E=Intger
		ArrayList<Integer> ar2= new ArrayList<>();
		//ade(E e)
		ArrayList<String> ar3 = new ArrayList<>();
		ar3.add("");
 		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(1);
		ar.add('b');
		ar.add(3.12);
		ar.add("나희창은 노예다");
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		Object obj = 1;
		//obj="나희창에겐 자유란 없다"
		int n = (Integer)obj;
		
		int num = (int)ar.get(0);
		String name = (String)ar.get(3);
	}
	
	public void study2() {
		ArrayList ar = new ArrayList();
		int num=1;
		Integer n = num;//autoBoxing 다형성
		ar.add(num);
		ar.add(1);      //autoBoxing
		
		ar.add('a');
	}
	
	public void study1() {
		int[]numbers = new int[3];
		ArrayList ar = new ArrayList();
		
		//대입
		numbers[0]=1;
		numbers[1]=2;
		
		ar.add(1);//0
		ar.add(2);//1
		ar.add(3);//2
		ar.add(1, 100);
		ar.set(0, 2000);
		ar.remove(0);
		ar.clear();
		
		System.out.println(numbers[0]);
		//System.out.println(ar.get[0]);
		
		for(int i =0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("List 출력");
		for(int i=0; i<ar.size();i++)
			System.out.println(ar.get(i));
	}
	
	

}
