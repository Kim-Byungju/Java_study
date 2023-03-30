package bak;

public interface Shape {
	
	final static double PI = 3.14;
	
	void draw();
	double getArea();
	
	default void redraw() {
		System.out.println("********* 다시그립니다.**********");
		draw();
		
		
	}
}
