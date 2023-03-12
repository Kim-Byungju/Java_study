package step1_클래스와객체;

class Circle {
	//필드
	int radius;
	String name;
	
	//생성자
	public Circle() {
	}
	//메소드
	double getArea() {
		return 3.14*radius*radius;
	}
	void setArea(int r) {
		radius =r;
	}
}

public class C2_피자 {
	public static void main(String [] args) {
		
		Circle pizza = new Circle();
		
		//pizza.radius = 10;
		pizza.setArea(10);
		pizza.name = "자바피자";
		
		double area = pizza.getArea();
		System.out.println("************************");
		
		Circle dount = new Circle();
		area = dount.getArea();
		System.out.println(area);
	}

}
