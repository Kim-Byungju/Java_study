package Ex;

import java.util.Calendar;
import java.util.Scanner;

/*
두명의 플레이어가 시작을 하고 10초를 예상해서 종료시켯을떄 10에가까운 플레이어가 승리하는 게임
String enter = sc.nextLine();
*/
public class WinGame {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int start = now.get(Calendar.SECOND);
		int end= now.get(Calendar.SECOND);
	
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("참가자의 이름을 입력해주세요.");
		
		String p1 = sc.next();
		System.out.println("참가자1 : "+p1);
		
		System.out.println("enter키를 눌러주세요.");
		sc.nextLine();
		
		System.out.println("두번쨰 enter키를 눌러주세요.");
		sc.nextLine();
		
		long et = System.currentTimeMillis();
		long st = et - System.currentTimeMillis();
		int sub = (int)(st - st);
		
		System.out.println(sub);
		
		
		
	
	
	}

}
