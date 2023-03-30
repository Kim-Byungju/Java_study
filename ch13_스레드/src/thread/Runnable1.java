package thread;

class CountRunnable implements Runnable {
	int num = 0;
	
	@Override
	public void run() {
		while(true) {
			System.out.println(num+"");
			num++;
			try {
				Thread.sleep(1000);  //러너블에서는 쓰레드를 따로 호출해서 sleep메소드를 선언해야하한다.
			} catch (InterruptedException e) {
				return;
			}
		}
		
	}
	
}

public class Runnable1 {

	public static void main(String[] args) {
		CountRunnable cr = new CountRunnable();
		
		Thread th = new Thread(cr);  //따로 쓰레드 객체를 만들어서 넣어야함.
		th.start();
	}
}
