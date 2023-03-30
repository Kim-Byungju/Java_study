package Ex;

import java.util.Calendar;

/*
 GoodMorning, GoodAfternoon, GoodEvening , Goodnight ~인사하기 
 06~11:59        12:00~18:59  19:00~23:59   00:00~05:59
현시간 기준으로 위 메시지 출력  아침이면 모닝 점심 에프터눈 저녁 굿이브잉 새벽은 굿나잇

*/
public class GoodHello {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); //Calendar 클새는 추상클래스이기 때문에 getInstance메소드를 이용하여 객체생성해야함ㄷ. 
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		
		switch(hour/6) {
		case 0 : System.out.println("Good Night");break;
		case 1 : System.out.println("Good Morning");break;
		case 2 : System.out.println("Good Afternoon");break;
		case 3 : System.out.println("Good Evening");break;
			
		}
	}

}
