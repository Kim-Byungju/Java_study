package Ex;

import java.util.Scanner;

/*
   컴퓨터와 가위바위보 게임하기
   - 가위1, 바위2 보3
   >>컴퓨터가 랜덤하게 가위바위보중 랜덤한 값을 가지게한다.(보이지않음)
   >>플레이어가 가위바위보를 내다.
   >>비교해서 승자를 알려준다.
   >>반복한다.
   

*/


public class RandomGame {

	public static void main(String[] args) {
		
		System.out.println("가위바위보 시작 합니다.");
		
		while(true) {
		for(int i=0; i<1; i++) {
			double ran = Math.floor((Math.random()*3+1));
			int ran1 = (int)ran;
			
			System.out.println("가위(1), 바위(2), 보(3) 숫자를 입력해주세요.");
			
			
			Scanner sc = new Scanner(System.in);
			int p1 = sc.nextInt();
			
			if(ran == p1) {
				System.out.println("기계 : "+ran);
				System.out.println("사람 : "+p1);
				System.out.println("비겼습니다.");
			} else if(ran > p1) {
				System.out.println("기계 : "+ran);
				System.out.println("사람 : "+p1);
				System.out.println("기계와의 전쟁에서 패배하셨습니다.");
			} else if(ran < p1) {
				System.out.println("기계 : "+ran);
				System.out.println("사람 : "+p1);
				System.out.println("축하합니다.당신은 기계와의 전쟁에서 승리하였습니다.");
			} 
		} 
		
		} 
			
		}
		
		
	}

