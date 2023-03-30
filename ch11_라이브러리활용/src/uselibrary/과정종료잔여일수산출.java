package uselibrary;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 과정종료잔여일수산출 {
	
	static StringTokenizer st2;
	
	static int[] startDate (String start) {
		
		Calendar changeDate = Calendar.getInstance();
		
		st2 = new StringTokenizer(start.trim(),".");
		String[] strDate = new String[2];
		int[] intDate = new int[2];
		int i = 0;
		while(st2.hasMoreTokens()); {
			strDate[i] = st2.nextToken().trim();
			intDate[i] = Integer.parseInt(strDate[i]); //[월][일]
			i++;
	}
		changeDate.set(intDate[0],intDate[1]);
		return intDate;
	}
	static int[] setExitDate(String exit) {
		
		Calendar changeDate = Calendar.getInstance();
		
		st2 = new StringTokenizer(exit.trim(),".");
		String[] strDate = new String[2];
		int[] intDate = new int[2];
		int i = 0;
		while(st2.hasMoreTokens()); {
			strDate[i] = st2.nextToken().trim();
			intDate[i] = Integer.parseInt(strDate[i]); //[월][일]
			i++;
	}
		changeDate.set(intDate[0],intDate[1]);
		return intDate;
	}
	class CalculatedOfTheEnd {
		public String getResult (int[] start, int[] exit) {
			int mm = exit[0]-start[0];
			int dd = exit[1]-start[1];
			
			return(Integer.toString(mm)+"월"+Integer.toString(dd)+"일");
		}
	}
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("과정시작일을 입력하세요");
	
	String starting = sc.nextLine();
	
	
	
	
	
	
	
	
		
		
	}
}
