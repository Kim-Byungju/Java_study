package thread;

class Th1 extends Thread{
	public void run() {
		System.out.println("스레드1");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("?????");
		}
	}
}
class Th2 extends Thread{
	public void run() {
		System.out.println("스레드2");
		try {
			sleep(500);
		} catch (InterruptedException e) {
			System.out.println("!!!!!");
		}
	}
}
public class Thread3 {

	public static void main(String[] args) {
		
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();
		
		for(int i=0; i<10000; i++) {
		t1.run();
		t2.run();
		}
		
	}	
	

}
