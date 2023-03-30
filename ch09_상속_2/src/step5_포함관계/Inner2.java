package step5_포함관계;


// 클래스 안에 클래스 있다.
class A {
	String name;
	A(String name) {
		this.name = name;
	}
	//************************
	class B {
		int age = 100;
		B() {
			
		}
		B(int age) {
			this.age = age;
		}
	}
	//*************************
	B getB() {
		return new B();
	}
	//*************************
	static class C {
		String address = "서울";
	}
	//*************************
	interface D{
		void print();
	}
	//*************************
	class E implements D {

		@Override
		public void print() {
			System.out.println("인터페이스를 구현했습니다.");
		}
		
	}
	void F() {
		class G{
			void print() {
				System.out.println("메소드안에 구현된 클래스 - 로컬 클래스");
			}
		}
		G g = new G();
		g.print();
	}
	
}

public class Inner2 {
	public static void main(String [] args) {
		
		//클래스
		
		A a = new A("홍길동");
		A.B b = a.new B(10);
		
		System.out.println(b.age);
		
		A a2 = new A("갑동이");
		
		A.B c = a.getB();
		System.out.println(c.age);
		
		//정적클래스
		
		A d  = new A("");
		A.C e = new A.C();
		System.out.println(e.address);
		
		System.out.println(a.name+"님의 나이는"+b.age+"살이고"+e.address+"살고있습니다.");
		
		//인터페이스
		A f = new A("길동이");
		A.E g = f.new E();
		g.print();
	}
}
