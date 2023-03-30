package generic;

class Point1<T,F> {
	T x;
	F y;
	Point1 (T x, F y) {
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public F getY() {
		return y;
	}
	public<C> C print(C i) {  //꺽쇠가로 메소드명앞에 붙여주고 그다음에 알파벳 적어준다.,
		System.out.println("i의 값은 " + i);
		C sum = i;
		System.out.println("sum : "+sum);
		return i;
	}
	//메소드 - 합계를 구하는 메소두ㅡ
	public <C> C calcul(String x, String y) {
		
		Double result = Double.parseDouble(x) + Double.parseDouble(y); 
		return (C)Double.toString(result);  //중괄호?
	}
}
public class Generic10 {
	public static void main(String [] args) {
		
		//1. x:정수 y:실수
		//2. x:실수 y:정수
		//3. x:실수 y:실수	
		
		Point1<Integer,Double> p = new Point1(10, 20.5);
		System.out.println("X : "+p.getX());
		System.out.println("y : "+p.getY());
		p.<String>print("1400");
		p.<Integer>print(3000);  //제네릭, 메소드앞에 꺽쇠가로 붙여준다.!!!!
		System.out.println(p.<String>calcul("100","300"));
//		Point1 <Double,Integer> p2 = new Point1(10.5, 20);
//		System.out.println("X : "+p2.getX());
//		System.out.println("y : "+p2.getY());
//		
//		Point1 <Double,Double> p3 = new Point1(10.5, 20.5);
//		System.out.println("X : "+p3.getX());
//		System.out.println("y : "+p3.getY());

	}
}
