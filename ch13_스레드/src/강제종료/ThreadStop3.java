package 강제종료;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class RandomTh extends Thread {
	Container contentPane;
	boolean flag = false;
	
	public RandomTh(Container contentPane) {
		this.contentPane = contentPane;
	}
	
	void finish() {
		flag = true;
	}
	public void run() {
		while(true) {
			
			//꽃이ㅉ찍히는 라벨생성
			JLabel la = new JLabel("죽어");
			la.setSize(80, 30);
			la.setFont(new Font("고딕체", Font.BOLD, 20));
			la.setForeground(Color.RED);
			
			//라벨을 붙일 좌표
			int x = (int)(Math.random()*contentPane.getWidth());
			int y = (int)(Math.random()*contentPane.getHeight());
			la.setLocation(x, y);
			contentPane.add(la);
			contentPane.repaint();
			
			try {
				sleep((int)(Math.random()*1000));
				if(flag == true) {
					contentPane.removeAll();
					JLabel finishJLabel = new JLabel("사망");
					finishJLabel.setSize(500,150);
					finishJLabel.setForeground(Color.WHITE);
					contentPane.add(finishJLabel);
					contentPane.repaint();
					return;
				}
			} catch (InterruptedException e) {
			
			}
		}
	}
}
public class ThreadStop3 extends JFrame{
	RandomTh rt;
	public ThreadStop3() {
		Container contentpane = getContentPane();
		contentpane.setBackground(Color.BLACK);
		contentpane.setLayout(null);
		contentpane.addMouseListener(new MouseAdapter() {

		@Override
		public void mousePressed(MouseEvent e) {   //마우스를 클릭하여 종료
			rt.finish();
		}
	});
	rt = new RandomTh(contentpane);
	
	setSize(1300,800);
	setVisible(true);
	
	rt.start();

	}
	public static void main(String[] args) {
		new ThreadStop3();

	}
}
