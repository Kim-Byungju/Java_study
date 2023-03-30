package 스레드제어;

class SumTh extends Thread {
	
	long sum;
	
	public long getSum() {
		return sum;
	}
	public void setSum(long sum) {
		this.sum = sum;
	}
	public void run() {
		for(int i = 1; i<=100; i++) {
			sum += i;
			try {
				sleep(50);
			} catch (InterruptedException e) {}
			System.out.println(sum);
		}
	}
}

public class Thread2 {
	public static void main(String[] args) {
		SumTh sumThread = new SumTh();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch (InterruptedException e) {}
		
		System.out.println("1~100까지 합 : " + sumThread.getSum());

	}

}
