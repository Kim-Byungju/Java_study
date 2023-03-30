package Ex;


import java.util.Calendar;
import java.util.Scanner;


/*
입사일 퇴사일(현재) 입력 받아서 근속기간 몇개월 인지 출력
*/
public class OperationDue {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int yy = now.get(Calendar.YEAR);
		int mm = now.get(Calendar.MONTH)+1; //0부터 시작
		int dd = now.get(Calendar.DATE);
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("입사년, 월, 일을 차례로 입력해주세요~");
		
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int month1 = (yy-year)*12 + (mm-month);
		
		System.out.println("근속기간은 "+month1+"개월 입니다.");
		
		

	}

}
