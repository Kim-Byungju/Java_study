package ch05_반복문;

import java.util.Scanner;

//숫자 맞추기 게임

public class Dowhile3 {

	public static void main(String[] args) {
		
		System.out.println("1~100에서 어떤숫자일까요?");
		Scanner sc = new Scanner(System.in);
		
		int answer = (int)(Math.random()*100)+1;
		int cnt = 0;
		int num;
		
		//10번이 넘어서면 출력 해준다. 10번이 넘었다고 출력
		// 게임을 다시 랜덤을 생성해서 새롭게할수있다. >> 계속 하시겠습니까?
		
		do {
			cnt++;
			num = sc.nextInt();
			if(answer == num) {
				System.out.println("축합푸카 "+cnt+"번에 맞췄습니다.");
			}
			else if(answer > num) {
				System.out.println("더큰수를 입력하시오");
			}
			else {
				System.out.println("더 작은수를 입력하시오");
			}
		
		} while(cnt<10);
		System.out.println("");
	}

}
