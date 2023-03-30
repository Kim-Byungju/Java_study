package collection;

import java.util.Vector;

class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}

public class Vector2 {

	public static void main(String[] args) {
		
		// Point를 저장할수있는 벡터를 생성해서
		Vector<Point> vc = new Vector<Point>();
		
		Point p1 = new Point(10, 20);
		Point p2 = new Point(30, 40);
		Point p3 = new Point(50, 60);
		Point p4 = new Point(70, 80);
		Point p5 = new Point(90, 100);
		
		// 임의의 값 x,y을 갖는 point 객체 5개를 저장하고
		vc.add(p1);
		vc.add(p2);
		vc.add(p3);
		vc.add(p4);
		vc.add(p5);
		
		//전체를 출력해보시오
		for(int i = 0; i<vc.size(); i++) {
			Point p = vc.get(i);             //Point p객체에 vc 주소값을 주어 초기화한뒤..
			System.out.println(p.getX());    //Point p 메소드에서 getX를 사용하여 출력..
			System.out.println(p.getY());
			System.out.println("***********");
			
		}
		
		
		
		
		
		
		
		
		

	}

}
