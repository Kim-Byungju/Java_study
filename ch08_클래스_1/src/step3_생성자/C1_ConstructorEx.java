package step3_생성자;

/*
	this     : 내 자신의 객체
	this()   : 나의 생성자 호출, 오버로딩방식 호출, 첫줄에 작성해야 한다.
	super    : 부모의 객체
	super()  : 부모의 생성자, 오버로딩 방식 호출




*/
class Sonata {
	
	//생성자 - 기본생성자, 초기화, 반환타입이 없다., void를 사용하지않고 return도 없다..
	Sonata() { 			//기본 생성자
		
	}
	Sonata(int num) {  //int 생성자
		System.out.println("자동차 도어수는"+num+"개 입니다.");
	}
	Sonata(String color) { // String 생성자
		System.out.println("자동차 도어수는"+color+"색 입니다.");
		}
	Sonata(int num, String option) {
		this(num);
		System.out.println("옵션은"+option+"입니다.");
		}
}

public class C1_ConstructorEx {

	public static void main(String[] args) {
		
		Sonata car1 = new Sonata();  //기본생성자 호출
		Sonata car2 = new Sonata(2); // int타입 객체생성
		Sonata car3 = new Sonata("파랑"); //String 타입 객체생성
		System.out.println("*****************");
		Sonata car4 = new Sonata(4, "에어백");

	}

}
