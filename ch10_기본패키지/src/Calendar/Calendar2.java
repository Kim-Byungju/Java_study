package Calendar;

import java.util.Calendar;

public class Calendar2 {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONDAY)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH); //월단위
		int week = cal.get(Calendar.DAY_OF_WEEK); //월단위
		int hour = cal.get(Calendar.HOUR); //월단위
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY); //월단위
		int ampm = cal.get(Calendar.AM_PM); //월단위
		int minute= cal.get(Calendar.MINUTE); //월단위
		int second = cal.get(Calendar.SECOND); //월단위
		int millisecond = cal.get(Calendar.MILLISECOND); //월단위
		
		System.out.println("년"+year+"");
				switch(week) {
				case Calendar.SUNDAY : System.out.println("일료일");break;
				case Calendar.MONDAY : System.out.println("월료일");break;
				case Calendar.TUESDAY : System.out.println("화료일");break;
				case Calendar.WEDNESDAY : System.out.println("수료일");break;
				case Calendar.THURSDAY: System.out.println("목료일");break;
				case Calendar.FRIDAY : System.out.println("금요일");break;
				case Calendar.SATURDAY : System.out.println("토요일");break;
				}
				System.out.println("");
	}
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		printCalendar("지금시각...", now);
		
		Calendar datetime = Calendar.getInstance();
		
		

	}

}
