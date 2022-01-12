package com.iu.lang.wrapper;

import java.util.Scanner;

public class WrapperEx1 {
	
	private Scanner sc;
	
	
	
	public void ex2() {
		System.out.println("주민번호를 앞자리를 입력해주세요");
//		String number1 =sc.next();
//		System.out.println(number1);
		String number1= "940329-1163119";
		// 키보드로 부터 주민등록 번호 입력
		// 9 7 1 2 2 4 - 1 2 3 4 5 6 7 - 마지막 번호는 체크용 번호
		//*2 3 4 5 6 7 - 8 9 2 3 4 5 
		// 18 21 4 10 12 28 8 18 6 12 20 30
		//결과를 모두 더함 ex)   122
		
		int source=2;
		int sum=0;
		
		for(int i=0;i<number1.length()-1;i++) {
	
		String result = number1.substring(i, i+1);
//		if(result.equals("-")) {
//			continue;
//		}
		if(!result.equals("-")) {
		System.out.println(Integer.parseInt(result));
		}
		}
		//--------------------------------------------
		for(int i =0;i<number1.length()-1;i++) {
			
			char ch = number1.charAt(i);
			//Integer.parseInt(ch+"");
		if(ch!='-') {
		int num = Integer.parseInt(String.valueOf(ch));
		sum=sum+num*source;
		source++;
		if(source>9) {
			source=2;
		}
		}
	}//for 끝
		System.out.println(sum);
		//2. 모두 더한 결과값을 11로 나누어서 나머지를 구함
		//122/11  -> 11.......1
		sum = sum%11;
		
		sum = 11-sum;
		
		if(sum>9) {
			sum = sum%10;
		}
		
		int check = Integer.parseInt(String.valueOf(number1.charAt(number1.length()-1)));
		System.out.println("check :" +check);
		System.out.println("Sum : "+sum);
		if(sum==check) {
			System.out.println("OK");
		}else {
			System.out.println("Fail");
		}
		
		//3. 11로 나눈 나머지값을 11에서 빼고 그 값을 체크용 번호와 비교
		// 11-1=10=7
		//4. 만약에 결과값이 두자리면 결과값을 다시 10으로 나누어서 그 나머지 값이
		//체크용 번호와 같은지 비교
		//10/10 ---0==7
		//같으면 정상적인 주민번호, 아니면 잘못된 번호
	}
	
	public void ex1() {
		// 키보드로 부터 주민등록 번호 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 앞자리를 입력해주세요");
		String number1 =sc.next();
		System.out.println("주민번호 뒷자리를 입력해주세요");
		String number2 = sc.next();
		System.out.println("주민번호 : "+number1 + "-"+ number2);
		System.out.println("현재 년도를 입력해세요");
		int year = sc.nextInt();
		System.out.println(year+"년");
		
		// 011224 - 1234567
		String title = number1;
		String result = number1.substring(0,2);
		
		System.out.println("생년 : "+ result);
		
		String title2 = number2;
		String result2 = number2.substring(0, 1);
		
		int i = Integer.parseUnsignedInt(result);
		
		System.out.println(result2);
		
		//나이를 대충 계산
		if(result2.equals("1")|| result2.equals("2")) {
			//int age = year-(1900+result)+1;
			int age = year-(1900+i)+1;
			System.out.println("나이 : " + age + "살");
			
		} else if(result2.equals("3")||result2.equals("4")) {
			int age = year - (2000+i)+1;
			System.out.println("나이 : " + age + "살");
			
		} 

		//남자? 여자?
		if(result2.equals("1")||result2.equals("3")) {
			System.out.println("성별 : "+"남성");
		}else if (result2.equals("2")|| result2.equals("4")) {
			System.out.println("성별 : "+ "여성");
		}
		String result3 =number1.substring(3,4);
		System.out.println(result3);
		if(result3.equals("3")||result3.equals("4")||result3.equals("5")) {
			System.out.println("태어난 계절 : "+ "봄");
		}else if (result3.equals("6")||result3.equals("7")||result3.equals("8")) {
			System.out.println("태어난 계절 :" + "여름");
		}else if(result3.equals("9")||result3.equals("10")||result3.equals("11")) {
			System.out.println("태어난 계절 :" + "가을");
			
		}else if (result3.equals("12")||result3.equals("1")||result3.equals("2")) {
			System.out.println("태어난 계절 : " + "겨울");
		}
		
		
		
		
		
		//3-5 : 계절 봄
		//6-8 : 여름
		//9-11: 가을
		//12-2 : 겨울
	}

}
