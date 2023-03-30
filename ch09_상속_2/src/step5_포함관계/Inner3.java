package step5_포함관계;

class Outer {
	private int num = 10;
	private static int sNum = 20;
	String name = "아우터";
	 Inner inner; 
	 
	 public Outer() { 
		 inner = new Inner(); //
		 }
	 

	public class Inner {
		int score = 10;

		void print() {
			System.out.println("잼씀니다.");
			System.out.println(num); // private 바깥쪽 멤버 // Inner클래스가 Outer클래스 내부에 있어서 private도 접근가능
			System.out.println(sNum); // private 바깥쪽 정적멤버
			System.out.println(name); // 멤버변수
		}
	}
}

public class Inner3 {

	public static void main(String[] args) {

		// 실습
		Outer a1 = new Outer();
		Outer.Inner b = a1.new Inner();

		System.out.println(b.score);
		b.print();

		String name = a1.name;
		
		//생성자를 통한 내부객체생성
		
		Outer oc = new Outer();
		int value = oc.inner.score;
		System.out.println(value);  //스코어값 : 10출력

	}

}
