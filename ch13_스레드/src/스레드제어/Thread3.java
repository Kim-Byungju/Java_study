package 스레드제어;

class ShareBoard {
	int sum = 0;
	
	//공유영역
	public void add() {
		int n = sum;
		Thread.yield();//스레드실행을 양보
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName()+":"+sum);
	}
	public int getSum() {
		return sum;
	}
}

class StudentThread extends Thread {
	
	ShareBoard board;
	public StudentThread(String name, ShareBoard board) {
		super(name);
		this.board = board;
	}
	
	
	@Override
	public void run() {
		for(int i = 0; i<10; i++)
			
			//공유하는 곳을 호출한곳 
			board.add();
	}
}
public class Thread3 {
	
	
}
