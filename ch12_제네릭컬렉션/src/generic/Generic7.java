package generic;

class Point<T>{
	T x;
	T y;
	
	Point(T x, T y){
		this.x=x;
		this.y=y;
	}
	public T getX() {
		return x;
	}
	public T getY() {
		return y;
	}
}

public class Generic7 {
	public static <T>double makeRectangle(Point<T> p1, Point<T> p2) {
		//p1,p2의 x,y값을 읽어서 width와 height을 구하고 반환
		
		double left = ((Double)p1.getX()).doubleValue();  
		double right = ((Double)p2.getX()).doubleValue(); 
		double top = ((Double)p1.getY()).doubleValue(); 
		double bottom = ((Double)p2.getY()).doubleValue();  
		
		double width = right-left;
		double height = bottom-top;
		
		return width*height;
	}
	public static void main(String[] args) {
		
		//Point p1 = new Point(0, 0);
		//Point p2 = new Point(10, 10);
		
		Point<Double> p1 = new Point(0.0, 0.0);
		Point<Double> p2 = new Point(10.0, 10.0);
		
		System.out.println("구하려고 하는 면적은?"+makeRectangle(p1, p2));

	}

}
