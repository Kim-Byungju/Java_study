package ch05_반복문;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력해주세욧");
		
		int num = sc.nextInt(); 
		
		for(int i=1; i<num; i++) {      //1      2        3
			
			for(int j=1; j<10; j++) {  // 1234~9   12345~9  123456~9
				
				// 1) 짝수단만 출력
				// 2) 홀수단만 출력
				// 3) 3의배수단만 출력
				// 4) 6이하만 출력
				if(i % 3 ==0) { 
					System.out.println(i+ "*" +j+"="+(i*j));
				}
				
			}
			
		}
		System.out.println("끝났습니다.");
	}
}
