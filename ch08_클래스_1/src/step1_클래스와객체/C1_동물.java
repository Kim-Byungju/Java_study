package step1_클래스와객체;

class 동물 {
	//필드 - 나이, 키,주소
	String name;
	int age;
	float height;
	String address;
	//생성자는 class 이름과 동일
	동물() {
	}
	//메소드 - 달리기(),먹기(), 소개하기()
	void 말하기() {
		System.out.println(name+"입니다.");
	}
	void 달리기() {
	}
	void 먹기() {	
	}
	void 소개하기() {
		System.out.println("나의 이름은"+name+"이고 나이는"+age+"살, 키는"+height+"이고, 주소는"+address+"입니다.");
	}
}


// 실행 클래스
public class C1_동물 {
	public static void main(String [] args) {
		동물 animal = new 동물();
		animal.name = "고양이";
		animal.말하기();
		animal.달리기();
		animal.먹기();
		animal.소개하기();
		animal.age = 17;
		animal.height = 13;
		animal.address = "서울시 중랑구";
		
		C1_사람 person = new C1_사람();
		person.name="홍길동";
		person.age=30;
		person.hp="010-3282-6188";
		
		person.소개하기();
	}
}
