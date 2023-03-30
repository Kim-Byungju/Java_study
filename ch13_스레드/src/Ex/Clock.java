package Ex;

import java.util.Calendar;

public class Clock extends Thread {

	public static void main(String[] args) {
	
	}
	public Clock() {
		MyTimer mt  = new MyTimer();
		mt.start();
		
	}
	class MyTimer extends Thread {
		
		public void run() {
			while(true) {
				String time = getTime();
				System.out.println(time);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					
				}
			}
		}
		String getTime() {
			Calendar now = Calendar.getInstance();
			int yy = now.get(Calendar.YEAR);
			int mm = now.get(Calendar.MONTH)+1;
			int dd = now.get(Calendar.DAY_OF_MONTH);
			int hour = now.get(Calendar.HOUR_OF_DAY);
			int min = now.get(Calendar.MINUTE);
			int second = now.get(Calendar.SECOND);
			
			String nowTime = yy+"-"+mm+"-"+dd+"-"+hour+"-"+min+"-"+second;
			return nowTime;
		}

	}

}
