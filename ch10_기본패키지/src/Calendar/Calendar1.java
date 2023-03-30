package Calendar;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		int yy = now.get(Calendar.YEAR);
		int mm = now.get(Calendar.MONTH)+1; //0부터 시작
		int dd = now.get(Calendar.DATE);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int ampm = now.get(Calendar.AM_PM);  //0 or 1 반환값(정수형)
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		
		System.out.println(yy+"년"+mm+"월"+dd+"일");
		
		int week = now.get(Calendar.DAY_OF_WEEK); // 일요일:1, 월요일:2...토요일:7
		switch(week) {
			case 1: System.out.print("일요일 ");break;
			case 2: System.out.print("월요일 ");break;
			case 3: System.out.print("화요일 ");break;
			case 4: System.out.print("수요일 ");break;
			case 5: System.out.print("목요일 ");break;
			case 6: System.out.print("금요일 ");break;
			case 7: System.out.print("토요일 ");break;
		}
		System.out.println(hour+"시"+min+"분"+sec+"초");
	}

}

