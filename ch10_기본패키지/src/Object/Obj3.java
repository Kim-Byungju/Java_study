package Object;

import java.util.Scanner;

class Point{
	int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Point p) {
		if(x==p.x && y==p.y)
			return true;
		else
			return false;
	}
}

public class Obj3 {

	public static void main(String[] args) {
		
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		
		if(a == b) {
			System.out.println("a==b");
		} else {
			System.out.println("a!=b");
		}
		
		if(a.equals(b)) {
			System.out.println("a와 b 는 같다.");
		} else {
			System.out.println("a와 b 는 다르다.");
		}
		
		if(a.equals(c)) {
			System.out.println("a와c는 같다");
		} else {
			System.out.println("a와c 다르다");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = sc.next();
		System.out.println("나이입력");
		int age = sc.nextInt();
		
		if(name.equals("홍길동")) {
			
		}
		if(age==10) {
			
		}
	}

}
