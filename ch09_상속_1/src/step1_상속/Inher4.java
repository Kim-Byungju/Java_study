package step1_상속;

class A2 {
	int a = 5;
	int b = 7;
	A2() {
		System.out.println("A2의 기본생성자");
	}
	void display() {
		System.out.println("월요일");
	}
	void print() {
		System.out.println("부모 메소드");
	}
}
class A3 extends A2{
	int a = 10;
	int b= 100;
	A3() {
		System.out.println("자식의 기본생성자");
	}
	void print() {
		super.print();
		System.out.println("난 자식 멤버 이자식아 : a="+this.a); //자식의 a 
		System.out.println("난 부모 멤버 : a="+super.a);  // 부모의 a
		System.out.println("난 자식 멤버 : b="+b);
		
		
	}
}

//실행
public class Inher4 {

	public static void main(String[] args) {
		
		A3 a = new A3();
		a.print();
		a.display(); //부모메소드

	}

}
