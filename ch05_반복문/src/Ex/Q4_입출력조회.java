package Ex;

import java.util.Scanner;

public class Q4_입출력조회 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("| 1.예금| 2.출금| 3.잔액조회| 4.종료 |");
			System.out.println("-------------------------------");
			
			
			System.out.println("메뉴를 선택하세요");
			int menu = sc.nextInt();
			
			if(menu == 4) {
				run = false;
			} else if(menu == 1) {
				System.out.println("예금할 금액을 입력하세요");
				balance += sc.nextInt();
				System.out.println("현재잔액은 "+balance+"원 입니다.");
			} else if(menu == 2) {
				System.out.println("출금할 금액을 입력하세요");
				balance -= sc.nextInt();
				System.out.println("출금 후 잔액은 "+balance+"원 입니다.");
			} else if(menu == 3) {
				System.out.println("고객님의 현재  잔액은 "+balance+"원 입니다.");
			}
			sc.close();
			System.out.println("프로그램을 종료합니다.");
		}
		
	}

}
