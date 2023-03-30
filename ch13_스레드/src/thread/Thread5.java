package thread;

//현재시간을 년월일 시분초로 1초단위로 출력하시오.
import java.util.Calendar;
import java.util.Scanner;

class CountA extends Thread {
	
	public void run() {
		while(true) {  //반복해서 초기화 해야해서 와일문안에 넣어준다.
			Calendar ct1 = Calendar.getInstance();  
			int yy = ct1.get(Calendar.YEAR);
			int mm = ct1.get(Calendar.MONTH)+1;
			int dd = ct1.get(Calendar.DATE);
			int hour = ct1.get(Calendar.HOUR_OF_DAY);
			int min = ct1.get(Calendar.MINUTE);
			int sec = ct1.get(Calendar.SECOND);
			System.out.println(yy+"년 "+mm+"월 "+dd+"일 "+hour+"시 "+min+"분 "+sec+"초");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class Thread5 {

	public static void main(String[] args) {
		
		CountA tiktok = new CountA();
		
		tiktok.start();	
	}
}
