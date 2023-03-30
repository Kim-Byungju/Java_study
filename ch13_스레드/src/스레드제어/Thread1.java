package 스레드제어;

class TargetThread extends Thread {
	
	public void run() {
		for(long i=0; i<1000000000; i++) {
			
		}
		try {
			sleep(1500); //일시정지
		} catch (Exception e) {
			
			for(long i =0; i<1000000000; i++) {
				//내용없음
			}
		}
	}
}
class StatePrintThread extends Thread {
	Thread targetThread;   //target의 스레드 상태를 조회하려함
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타깃스레드 상태 : "+state);
			
			if(state == Thread.State.NEW) {  //객체생성상태라면
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {  //스레드가 종료상태라면
				break;
			}
			try {
				sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class Thread1 {

	public static void main(String[] args) {
		StatePrintThread st = new StatePrintThread(new TargetThread());
		st.start();

	}

}
