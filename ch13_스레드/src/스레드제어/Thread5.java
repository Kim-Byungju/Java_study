package 스레드제어;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Thread5 extends JFrame {
	
	public Thread5() {
		GPanel p = new GPanel();
		setContentPane(p);
		setSize(800,600);
		setVisible(true);
		setFocusable(true);
	}
	public static void main(String [] args){
		new Thread5();
	}

}

class GPanel extends JPanel {
	
	public GPanel() {
		setLayout(null);
		addMouseListener(new MouseAdapter() {
		
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				BubbleTh th= new BubbleTh(e.getX(),e.getY());
				th.start();
			}
		});
	}
	//그래픽
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		ImageIcon image = new ImageIcon("image/배경.jpg");
		Image im = image.getImage();
		g.drawImage(im, 0,0,getWidth(),getHeight(),this);
		repaint();
	}
	
	//스레드
	class BubbleTh extends Thread {
		
		JLabel bubble;
		ArrayList<ImageIcon> imageArr = new ArrayList<ImageIcon>();
		
		public BubbleTh(int bubbleX, int bubbleY) {
			imageArr.add(new ImageIcon("image/풍선1.png"));
			imageArr.add(new ImageIcon("image/풍선2.png"));
			imageArr.add(new ImageIcon("image/풍선3.png"));
			imageArr.add(new ImageIcon("image/풍선4.png"));
			
			int ran = (int)(Math.random()*4);
			 ImageIcon img = imageArr.get(ran);
			 
			 bubble  = new JLabel();
			 bubble.setSize(img.getIconWidth(), img.getIconHeight());
			 bubble.setLocation(bubbleX, bubbleY);
			 add(bubble);
			 repaint();
			 
		}
		public void run() {
			
			while(true) {
				int x = bubble.getX();
				int y = bubble.getY()-1;
				
				if(y<0) {
					remove(bubble);
					repaint();
					return;
				}
				bubble.setLocation(x, y);
				repaint();
				try {
					sleep(50);
				} catch (InterruptedException e) {}
			}
		}
	}
}
