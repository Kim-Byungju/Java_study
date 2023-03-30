package step1_상속;

class Point {
	int x, y;
	
	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void showPoint() {
		System.out.println("x,y : "+x+","+y);
	}
}
class ColorPoint extends Point  {
	String color;
	
	void setColor(String color) {
		this.color = color;
	}
	void showColor() {
		System.out.println("color : "+color);
		System.out.println("x,y : "+x+","+y); //상속받아서 바로 출력
		
		System.out.println("-------------------------------");  //구분선
		
		showPoint(); // 상속받아서 메소드 호출
		
		System.out.println("-------------------------------"); //구분선
		
		Point a = new Point();
		a.set(15, 13);
		System.out.println(a.x+","+a.y); //객체생성하여 호출 하여 출력
	}
	
}

/*Point
		int x,y
		set(int,int) :void
		showPoint() : void --(x,y) 출력

 ColorPoint
 		String color
 		setColor(String) :void
 		showColorPoint() :void  -- > 칼라
 									(x,y) 출력
 
 */

public class Inher2_ColorPointEx {
	public static void main(String[] args) {
		
		//Point p = new Point();  // 상속받았기 떄문에.. 굳이 부모 객체 생성할 필요없음
		ColorPoint c = new ColorPoint();
		
		c.set(3, 4);   //상속받아서 부모 메소드도 바로 호출가능하다.
		c.setColor("red");
		c.showColor();
		
	}
}
