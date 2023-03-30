package 강제종료;

import javax.swing.JOptionPane;

class Counter extends Thread {
	int num = 1;
	boolean flag = false;
	
	public void finish() {
		flag = true;
	}
	
	public void run() {
		String str = JOptionPane.showInputDialog("몇초에서 멈출까요?");
		int i = Integer.parseInt(str);
		
		while(true) {
			System.out.println(num+" ");
			if(num % 10 == 0) {
				System.out.println();
			}
			num++;
			if(num==(i)) {
				finish(); //true로 변경
			}
			try {
				sleep(1000);
				if(flag==true) {
					return;
				}
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}
public class ThreadStop2 {
	public static void main(String[] args) {
		Counter c = new Counter();
		c.start();
	}
	
		 
}
