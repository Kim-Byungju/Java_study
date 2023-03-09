package ch07_예외처리;

//ArithmeticException : 정수를 0으로 나눌수 없으때 나오는 에러
//try~catch~finally로 예외 처리


import java.util.Scanner;

public class E1_ArithmeticException {

	public static void main(String[] args) {
		System.out.println("두수를 입력하시오");
		Scanner sc = new Scanner(System.in);
		
		int divisor;
		int dividend;
		
		System.out.println("나뉨수를 입력하시오");
		dividend = sc.nextInt();
		
		System.out.println("나눌수를 입력하시오");
		divisor = sc.nextInt();
		
		//System.out.println(dividend+"/"+divisor+"="+(dividend/divisor));
		
		try {
			System.out.println(dividend+"/"+divisor+"="+(dividend/divisor));
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수가 없습니다.");
		} finally {
			
		}
		System.out.println("종료합니다.");
		sc.close();
	}

}
