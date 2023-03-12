package step5_접근지정자;
//1. 같은 패키지에서 호출
public class A4_PrivateB {
	
	int age;
	public A4_PrivateB() {
		
		A4_PrivateA pa = new A4_PrivateA();
		//		pa.name = "홍길동";   //2. 같은 클래스내에서 접근
	}
	int getAge() {
		return age;
	}
}
