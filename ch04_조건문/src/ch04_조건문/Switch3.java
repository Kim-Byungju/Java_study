package ch04_조건문;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		
		System.out.println("숫자 2개와 연산자를 입력해보세요");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번쨰 숫자를 입력해라");
		int num1 = sc.nextInt();
		System.out.println("두번쨰 숫자를 입력해라");
		int num2 = sc.nextInt();
		System.out.println("연산자 입력해라");
		String op = sc.next();
		
		switch(op) { 
		case "+" : 
			System.out.println(num1+op+num2+"="+(num1+num2));
			break;
		case "-" : 
			System.out.println(num1+op+num2+"="+(num1-num2));
			break;
		case "*" : 
			System.out.println(num1+op+num2+"="+(num1*num2));
			break;
	

		}
	}

}
