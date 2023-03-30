package step3_인터페이스;

interface A {
	//상수
	final static double rate = 0.5;
	//추상메소드
	public abstract String getItem(String name);
	public abstract int getPrice();
	
	//기타메소드
	default void add(int num1, int num2) {
		int sum = num1 + num2;
		sub(num1, num2);
	}
	private void sub(int num1, int num2) {
		System.out.println(num1-num2);
	}
	static void mul(int num1, int num2) {
		System.out.println("A인터페이스 static: "+(num1*num2));
	}
}
interface B {
	final static double PI = 3.14;
	void div(int num1, int num2);
	default void print() {
		System.out.println("B인터페이스 default타입 print 메소드 ");
	}
}
interface F extends A,B{
	
}
class G implements F {

	@Override
	public String getItem(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void div(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}
	
}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
class D {
	void show() {
		System.out.println("D클래스의  show 메소드야");
	}
}
class E {
	void show2() {
		System.out.println("E클래스의  show2 메소드야");
	}
}
class C extends D implements A,B {

	@Override
	public void div(int num1, int num2) {
		
	}

	@Override
	public String getItem(String name) {

		return name +"님";
	}

	@Override
	public int getPrice() {

		return 1000;
	}
	
	//오버라이드 메소드
	public void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("오버라이드된 add :"+sum);
	}
	
}
public class Interface1 {

	public static void main(String[] args) {

		C c = new C();
		System.out.println(c.getItem("새우깡"));
		System.out.println(c.getPrice());
		
		c.print();
		c.add(100, 80);
		A.mul(5, 4);  //static 메소드
		
		c.show();
		
		//업캐스팅
		A a = new C();
		a.add(500, 300);
	}

}
