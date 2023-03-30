package thread;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class TimerThread2 implements Runnable {
	
	JLabel timerLabel;
	public TimerThread2(JLabel timerLabel) {
		this.timerLabel = timerLabel;
		
	}
	
	public void run() {
		String s = JOptionPane.showInputDialog("입력해주세요. 최소 10초 이상부터");
		int t = Integer.parseInt(s);
		Thread t1 = new Thread();
		
		for(int i = 1; i<=t; i++) {
			timerLabel.setText(Integer.toString(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
		timerLabel.setFont(new Font("Gothic", Font.BOLD, 50));
		timerLabel.setText("끝!!");
		t1.interrupt();
	}
}
public class Runnable2_타이머 extends JFrame{

	public Runnable2_타이머() {
		setTitle("타이머");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.CYAN);
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		timerLabel.setForeground(Color.PINK);
		
		c.add(timerLabel);
		
		setSize(300, 150);
		setVisible(true);
		
		TimerThread2 tt = new TimerThread2(timerLabel);
		Thread th = new Thread(tt);
		th.start();
	}
	public static void main(String[] args) {
		new Runnable2_타이머();
	}

}
