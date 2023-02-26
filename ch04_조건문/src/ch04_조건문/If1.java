package ch04_조건문;

import java.util.Scanner;

public class If1 {
	public static void main(String [] args) {
		
		System.out.println("숫자를 입력해주세요>>");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 3 == 0) {
			System.out.println(num+"은 3의 배수입니다.");
		} 
		else {
			System.out.println(num+"은 3의 배수가 아입니다.");
		}
			
		sc.close();
	}

}
