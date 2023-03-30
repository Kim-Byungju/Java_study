package Ex;

import java.util.Scanner;


//카운트해야할 숫자를 입력 받아서 1초씩 디스카운트출력하시오
class CountB extends Thread {
	int cnt;
	public void run(int cnt) {
		this.cnt = cnt;
		while(cnt >= 0) {
			System.out.println(cnt--); 
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class Discount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CountB a = new CountB();
				
		System.out.println("카운트해야할 숫자를 입력하시오");
		int cnt = sc.nextInt(); 
		a.run(cnt);
		sc.close();
	}


}
