package thread;

import java.util.Scanner;

public class Thread6 {
	int num;
	public Thread6() {
		System.out.println("카운트할 숫자를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		CountThread ct = new CountThread();
		ct.start();
	}
	class CountThread extends Thread {
		public void run() {
			for(int i = 0; i<num; i++) {
				int num = count();
				System.out.println(num+" ");
				try {
					sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
	}
	int number;
	int count() {
		//int number = num;
		for (int i= 0; i<num; i++) {
			number = (num-1);
		}
		return number;
	}
	public static void main(String[] args) {	
		new Thread6();

	}

}
