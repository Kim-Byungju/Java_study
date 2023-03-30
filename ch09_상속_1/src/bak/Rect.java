package bak;

public class Rect implements Shape{
	public double width;
	public double height;
	public Rect(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.println("가로 가"+width+"세로가"+height+"인 사각형을 그립니다.");
	}

	@Override
	public double getArea() {
		return width*height;
	}

}
