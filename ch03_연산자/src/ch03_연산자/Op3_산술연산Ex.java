package ch03_연산자;

import java.util.Scanner;

public class Op3_산술연산Ex {
	
	//초를 받아서 0시간 0분 0초로 출력하시오
	
	public static void main(String[] args) {
		
		int second, minute, hour;
		
		System.out.println("초를 입력하시오");
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		 
		hour = num1 / 3600;
		
		minute = num1 / 3600 & 60;
		
		second = minute % 60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초",num1, hour, minute, second);
		
		//집가서 다시 고민해보자.. 분처리를 제대로 ...
	
	}

}
