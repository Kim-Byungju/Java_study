package thread;

class AThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
		System.out.println("A스레드");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("실행중 방해를 받았습니다.");
			}
		}
	}
}
class BThread extends Thread {
	public void run() {
		for(int i=0; i<5; i++) {
		System.out.println("B스레드");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("실행중 방해를 받았습니다.");
			}
		}
	}
}
public class Thread1 {

	public static void main(String[] args) {
		
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		
		for(int i=0; i<5; i++) {
			System.out.println("A 실행");
		}
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		for(int i=0; i<5; i++) {
			System.out.println("B 실행");
		}
		System.out.println("*****************");
		
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		
		for(int i=0; i<5; i++) {
			System.out.println("A 실행");
		}
		AThread at = new AThread();
		at.start();
		
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		for(int i=0; i<5; i++) {
			System.out.println("B 실행");
		}
		BThread bt = new BThread();
		bt.start();
	}
}
