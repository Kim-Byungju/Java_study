package ch03_연산자;

import java.util.Scanner;

public class Op10_삼항조건연산자 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요>>");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력해주세요>>");
		int num2 = sc.nextInt();
		
		//System.out.println( num % 2 == 0 ? "짝수":"홀수");
		
		//sc.close();
		
		// 두개의 정수를 입력 받아서 그 두숫자의 차이(절대값)를 출력하시오
		
		System.out.println( num1 > num2 ? (num1-num2):(num2-num1)); 
		
	}

}
