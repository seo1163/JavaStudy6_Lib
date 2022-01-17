package com.iu.s4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력");
		int num=200;
		try {
			int age = sc.nextInt();
			//throw new InputMismatchException();
			int result=num/age;
			//throw new ArithmeticException();
		
		
			System.out.println("Age : "+ age);
			System.out.println("Result : "+ result);
		}catch(InputMismatchException exception) {
			System.out.println("숫자만 입력하세요");
		}catch(ArithmeticException exception) {
			System.out.println("0 으로 나눌 수 없어요");
		}catch(Exception exception) {
			System.out.println("알수없는 예외 발생");
		}catch(Throwable exction) {
			System.out.println("모든 예외는 여기서 처리");
		}
	}

}
