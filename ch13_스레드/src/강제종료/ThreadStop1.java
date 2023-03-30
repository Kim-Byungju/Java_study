package 강제종료;

public class ThreadStop1 extends Thread {

	int num = 0;
	public void run() {
		
		while(num<10) {
			System.out.println(num);
			num++;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadStop1 th = new ThreadStop1();
		th.start();
		th.interrupt();  //강제종료
	}
}
