package step1_클래스와객체;

class A {
	String str = "홍길동";
	//생성자는 생략 가능
	//생성자는 반환타입이 없다. void를 선언하지않는다.
	A() {		
	}
	A(String str) {
		this.str=str;
		System.out.println("나는 생성자야");
	}
	//반환없는 메소드
	void speak() {
		System.out.println("정의 이음은"+str+"입니다.");
	}
	//반환있는 메소드
	String getname() {
		return str;
	}
}

public class C9_PersonEx {
	public static void main(String [] args) {
		A a = new A();
		
		a.speak();
		a.str = "김길동";
		
		A b = new A("최길동"); // 생성자에서 출력.
		b.speak();
		
	}

}
