package Ex;

import java.util.Scanner;

public class Q1_구구단 {

	public static void main(String[] args) {

	
		// for활용 / while 문으로도 구현
		// 몇단, 몇수를 출력할까요?
		// 1단, 1수부터 입력받은 곳까지 구구단을 출력한다.

		System.out.println("몇단, 몇수를 출력할까요?");
	
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		int dan = sc.nextInt();
		System.out.println("수를 입력하세요");
		int su = sc.nextInt();
		
		for(int i=1; i<=dan; i++) {
			for(int j=1; j<=su; j++) {
			System.out.println(i+"*"+j+"="+(i*j));
		}

		
		System.out.println();
		
		}
		sc.close();
		
	}

}