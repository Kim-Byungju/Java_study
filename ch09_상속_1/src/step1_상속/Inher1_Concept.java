package step1_상속;


class A {
	public int p;
	private int n;
	
	public void setN(int n) {
		this.n=n;
		
	}
	public int getN() {
		return n;
	}
}
class B extends A{
	private int m;
	public void setM(int m) {
		this.m=m;
	}
	public int getM() {
		return m;
	}
	public String toString() {
		return getN()+","+getM();  // A클래스를 상속받아 getN메소드 사용가능하다.
	}
}

public class Inher1_Concept {

	public static void main(String[] args) {
		
		
		A a = new A(); // A객체
		B b = new B(); // A객체 + B객체
		
		
		a.p = 5;
		//a.n = 10; // private 접근불가
		a.setN(10);
		
		
		//상속관계에 있는 클래스 - 자식
		b.p = 20; //부모의 필드 p
		//b.n = 10; //private로 접근불가 
		b.setN(100);  //자식에서 부모메소드 호출
		
		b.setM(25);
		System.out.println(b.toString());

	}

}
