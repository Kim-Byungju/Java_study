package step1_상속;

class Car {
	String name = "자동차";
	void move() {
		System.out.println("이동합니다.");
	}
}
class Bus extends Car {
	String name = "버스";
	
	void move() {
		System.out.println("40명을 태우고 이동합니다.");
	}
}
class Ambulance extends Car {
	String name = "엠뷸런스";
	void move() {
		System.out.println("싸이렌을 울리며 이동합니다.");
	}
	void special( ) {
		System.out.println("환자를 태우고 있습니다.");
	}
	
}
class FireEngine extends Car {
	String name = "소방차";
	void move() {
		System.out.println("물을 뿜으며 이동합니다.");
	}
}
class CarManagement {
	Car print(Car c) {  //Car c= ab, 업캐스팅
		
		//Ambulance 객체에 name 값을  "긴급호송차"로 초기화 하고
		//Car 타입으로 반환한다.
		Ambulance a = (Ambulance)c; //다운캐스팅
		a.name = "긴급호송차";
		c = a; //업캐스팅
		
		return c;
		
	}
}

public class Inher9 {

	public static void main(String[] args) {

		Car[] car = new Car[3];
		
		car[0] = new Bus();
		car[1] = new Ambulance();
		car[2] = new FireEngine();
		
		for(Car c: car) {
			c.move();
			
			if(c instanceof Ambulance) {  //instanceof : 업캐스팅 되어있는 상태인지 확인하는 기능.
				Ambulance am = (Ambulance)c; //다운캐스팅
				am.special();
			}
			
			Ambulance ab = new Ambulance();
			CarManagement cm = new CarManagement();
			
			//Ambulance의 name값을 출력하시오.
			Car mycar = cm.print(ab);
			
			System.out.println("--------------");
			
			Ambulance a = (Ambulance)mycar;
			System.out.println(a.name);
			
			
		}
		
	}
}
