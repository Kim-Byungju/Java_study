package step5_접근지정자;
//1. 같은 패키지에서 호출
public class A2_ProtectedB {
	
	int age;
	public A2_ProtectedB() {
		
		A2_ProtectedA pa = new A2_ProtectedA();
				pa.name = "홍길동";   //2. 같은 클래스내에서 접근
	}
	int getAge() {
		return age;
	}
}
