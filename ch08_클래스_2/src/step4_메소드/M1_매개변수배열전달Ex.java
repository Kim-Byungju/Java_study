package step4_메소드;

import java.util.Scanner;

class Score{

	//성적들을(배열)을 받아서 계신하고 결과값을 배열로 반환하는 메서드
	int[] calculateAdd(int[] score) {
		for(int i=0; i<score.length; i++) {
			score[i]=score[i]+15;
		}
		return score;
	}
}

public class M1_매개변수배열전달Ex {

	public static void main(String[] args) {
		
		int[] s = new int[3];
		
		System.out.println("성적계산 프로그램");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번쟤 국어점수>");
		s[0] =sc.nextInt();
		
		System.out.println("두번쟤 영어점수>");
		s[1] =sc.nextInt();
		
		System.out.println("세번쟤 수학점수>");
		s[2] =sc.nextInt();
		
		Score cal = new Score();
		int[] score = cal.calculateAdd(s);
		
		for(int value: score) {
			System.out.println(value);
		}
	}

}
