package step5_접근지정자;
//1. 같은 패키지에서 호출
public class A3_DefaultB {
	
	int age;
	public A3_DefaultB() {
		
		A1_PublicA pa = new A1_PublicA();
				pa.name = "홍길동";   //2. 같은 클래스내에서 접근
	}
	int getAge() {
		return age;
	}
}
