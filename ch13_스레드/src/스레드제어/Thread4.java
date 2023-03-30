package 스레드제어;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


//공유된 라벨
class MyLabel extends JLabel {
	int barSize = 0;
	int maxBarSize;
	
	public MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.MAGENTA);
		int width = (int)(((double)(this.getWidth()))/maxBarSize*barSize);
		
		if(width==0) return;
		g.fillRect(0, 0, width, this.getHeight());
	}
	//공유 - 막대바 채우는 영역
	synchronized void fill() {
		if(barSize == maxBarSize) {
			try {
				wait();  //대기상태
			} catch (Exception e) {
				return;
			}
		}
		barSize ++;
		repaint();
		notify(); //대기꺠움 -->실행대기
	}
	synchronized void consume() {
		if(barSize == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				return;
			}
		}
		barSize--;
		repaint();
		notify();
	}
}

//공유되는 라벨 호출하는 스레드
class ConsumerThread extends Thread {
	
	MyLabel bar;
	public ConsumerThread(MyLabel bar) {
		this.bar = bar;
	}
	public void run() {
		while(true)
			try {
				sleep(200);
				bar.consume();
			} catch (InterruptedException e) {
				return;
		}
	}
}

//실행
public class Thread4 extends JFrame{
	MyLabel bar = new MyLabel(100);
	public Thread4(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		bar.setBackground(Color.orange);
		bar.setOpaque(true);
		bar.setLocation(20, 50);
		bar.setSize(300, 20);
		c.add(bar);
		
		c.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				bar.fill();
				
			}
		});
		setSize(350,200);
		setVisible(true);
		c.requestFocus();
		
		ConsumerThread th = new ConsumerThread(bar);
		th.start();
	}
	
	public static void main(String[] args) {
		new Thread4("enter 갈겨");
	}
}
