package step1_상속;

/*
			Shape
			draw()  - "shape"출력
			
			|
	-----------------
  	|       |       |
  	Line   Rect     Circle
  	draw() draw()   draw()
  	
  	
  	-업케스팅
  	-오버라이딩
  	-출력 :선을 그립니다.
  		사각형을 그립니다.
  		원을 그립니다.	
*/
class Shape {
	String shape;
	
	void draw(String shape) {
		this.shape=shape;
		System.out.println("shape1 : "+shape);
	}
}
class Line extends Shape{
	String line;
	
	void draw(String shape) {
		this.line=line;
		System.out.println("선을 그립니다.");
	}
}
class Rect  extends Shape{
	String rect;
	
	void draw(String shape) {
		this.rect = rect;
		System.out.println("사각형을 그립니다.");
	}
}
class Circle extends Shape {
	String circle;
	@Override
	void draw(String circle) {
		this.circle = circle;
		System.out.println("원을 그립니다.");
	}
}

public class Inher8_EX {

	public static void main(String[] args) {
		
		//업케스팅
		Shape s1 = new Line();
		Shape s2 = new Rect();
		Shape s3 = new Circle();
		
		s1.draw("");
		s2.draw("");
		s3.draw("");
		
		
		

	}

}
