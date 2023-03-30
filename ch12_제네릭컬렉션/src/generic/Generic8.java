package generic;

class Point2<T,V>{
	T x;
	T y;
	
	Point2(T x, T y){
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

public class Generic8 {
	public static <T,V>double makeRectangle(Point2<T,V> p1, Point2<T,V> p2) {
		//p1,p2의 x,y값을 읽어서 width와 height을 구하고 반환
		
		double left = ((Number)p1.getX()).intValue();  
		double right = ((Number)p2.getX()).intValue(); 
		double top = ((Number)p1.getY()).doubleValue(); 
		double bottom = ((Number)p2.getY()).doubleValue();  
		
		double width = right-left;
		double height = bottom-top;
		
		return width*height;
	}
	public static void main(String[] args) {
		
		//Point p1 = new Point(0, 0);
		//Point p2 = new Point(10, 10);
		
		Point2<Integer,Double> p1 = new Point2(0.0, 0.0);
		Point2<Integer,Double> p2 = new Point2(10.0, 10.0);
		
		System.out.println("구하려고 하는 면적은?"+makeRectangle(p1, p2));

	}

}
