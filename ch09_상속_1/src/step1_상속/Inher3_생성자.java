package step1_상속;

class A1 {
	
	A1() {
		System.out.println("생성자 A");
	}
}
class B1 extends A1 {
//	B1 () {}
	B1 (int x) {
		System.out.println("생성자 B");
	}
}
class C1 extends B1 {
	C1() {
		super(10);
		System.out.println("생성자 C");
	}
//	C1 (int x) {
//		System.out.println("생성자C에 매개변수 1개");
//	}
	void print() {
		System.out.println("생성자 우선순위에 대한 학습");
	}
}

public class Inher3_생성자 {

	public static void main(String[] args) {
		
		C1 c = new C1();

	}

}
