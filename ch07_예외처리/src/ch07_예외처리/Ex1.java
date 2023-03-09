package ch07_예외처리;

import java.util.Scanner;

// 정수배열을 5크기로 생성
//스캐너로 숫자를 반복해서 입력 받는다
// for문 이용해서 6까지 반복시켜서 입력받도록한다.

// 오류가 발생되면 내용을확인하고 예외처리
// 다시해보시오

public class Ex1 {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		System.out.println("숫자 5개 입력해봐");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<6; i++) {
			System.out.println("입력해주세요");
			array[i] = sc.nextInt();
		}
		System.out.println("종료되었습니다.");
	}

}
