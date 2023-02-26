package Ex;

import java.util.Scanner;

//년도를 입력받아서 그해가 윤년인지 판별한다.

		/*
		    윤년의 조건 
		    -4의 배수인해
		    -400의 배수인해
		    -단 100의 배수인해는 아님		  
		 */		

public class Ex4_윤년판별 {

	public static void main(String[] args) {

	System.out.println("년도를 입력하시오.");

	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
	
	if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
		System.out.println("윤년입니다.");
		} else {
			System.out.println("평년 입니다.");

		} 		 
		sc.close();
	}
}
