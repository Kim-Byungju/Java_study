package step2_필드;

class Car{
	//자바는 멤버 변수에 값을 넣지않으면 String객체는 null, int는 0으로 초기화 된다.
	String color = null;
	static int speed; //정적변수
	//int speed; //멤버변수
	
	
	void speedUp() {
		System.out.println(speed+"속도를 올렸습니다.");
	}
	void print() {
		System.out.println("색 : "+color);
		System.out.println("속도 : "+speed);
	}
}

public class V2_초기화Ex {

	public static void main(String[] args) {
		
		System.out.println("********myCar********");
		Car myCar = new Car();
		myCar.color = "초록";
		myCar.speed = 100;
		myCar.print();
		
		System.out.println("*******yourCar*********");
		
		Car yourCar = new Car();
		yourCar.color = "노랑";
		yourCar.speed = 120;
		yourCar.print();
		System.out.println("********myCar********"); //static으로 객체 간 공유
		myCar.print();
		
	}

}
