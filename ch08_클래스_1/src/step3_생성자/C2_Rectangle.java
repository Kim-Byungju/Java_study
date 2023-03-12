package step3_생성자;

class Shape{
	int width;
	int height;
	int depth;
	//정사각형의 너비를 출력하는 생성자  
	
	//직사각형의 넓이를 출력하는 생성자 
	
	//직육면체의 부피를 출력하는 생성자
	Shape(int width) {
		System.out.println("정사각형의 넓이는"+(width*width)+"입니다.");
	}
	Shape(int width, int height) {
		System.out.println("직사각형의 넓이는"+(width*height)+"입니다.");
	}
	Shape(int width, int height, int depth) {
		System.out.println("정육면체의 넓이는"+(width*height*depth)+"입니다.");
	}
}

public class C2_Rectangle {

	public static void main(String[] args) {
		
		Shape s1 = new Shape(10);
		Shape s2 = new Shape(10,20);
		Shape s3 = new Shape(10,20,30);
		

	}

}
