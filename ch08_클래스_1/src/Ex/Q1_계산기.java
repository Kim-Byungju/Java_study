package Ex;

import java.util.Scanner;

class Add {
	int a1;
	int b1;
	int result1;
	
	Add() {
		
	}
	
	Add(int a1, int b1, int sum) {
		this.a1 = a1;
		this.b1 = b1;
		this.result1 = result1;
	}
	int add(int a1, int b1) {
		result1 = a1+b1;
		System.out.println(a1+"+"+b1+"="+result1);
		return result1;
	}
}
class Sub {
	int a2;
	int b2;
	int result2;
	
	Sub() {
		
	}
	
	Sub(int a2, int b2, int result2) {
		this.a2 = a2;
		this.b2 = b2;
		this.result2 = result2;
	}
	int sub (int a2, int b2) {
		result2 = a2-b2;
		System.out.println(a2+"-"+b2+"="+result2);
		return result2;
	}
}
class Mul {
	int a3;
	int b3;
	int result3;
	
	Mul() {
		
	}
	
	Mul(int a3, int b3, int result3) {
		this.a3 = a3;
		this.b3 = b3;
		this.result3 = result3;
	}
	int mul (int a3, int b3) {
		result3 = a3*b3;
		System.out.println(a3+"*"+b3+"="+result3);
		return result3;
	}
}
class Div {
	int a4;
	int b4;
	int result4;
	
	Div() {
		
	}
	
	Div(int a4, int b4, int result4) {
		this.a4 = a4;
		this.b4 = b4;
		this.result4 = result4;
	}
	float div (int a4, int b4) {
		result4 = a4/b4;
		System.out.println(a4+"/"+b4+"="+(float)result4);
		return result4;
	}
}
/*
1. 계산기프로그램구현
class Add
class Sub
class Mul
class Div

두정수와 연산자를 입력받아서
 switch 문으로 연산처리
*/
public class Q1_계산기 {
	
	public static void main(String[] args) {
		
		Add add1 = new Add();
		Sub sub1 = new Sub();
		Mul mul1 = new Mul();
		Div div1 = new Div();
		
		System.out.println("두정수와 연산자를 입력하시오");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자(1)를 입력해주세요..");
		int num1 = sc.nextInt();
		System.out.println("숫자(2)를 입력해주세요..");
		int num2 = sc.nextInt();
		
		System.out.println("연산자를 입력해주세요..");
		String op = sc.next();
		
		switch (op) {
		case "+" :
			System.out.println("더하기 연산결과");
			add1.add(num1, num2);
			break;
		case "-" :
			System.out.println("빼기 연산결과");
			sub1.sub(num1, num2);
			break;
		case "*" :
			System.out.println("곱하기 연산결과");
			mul1.mul(num1, num2);
			break;
		case "/" :
			System.out.println("나누기 연산결과");
			div1.div(num1, num2);
			break;
		}
		sc.close();
		
		
	}
	

}
