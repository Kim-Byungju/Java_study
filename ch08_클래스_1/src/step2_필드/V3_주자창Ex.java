package step2_필드;

class Parking{
	String carName;
	int inTime;
	int outTime;
	final int AMTPERTIME = 3000;
	
	Parking(String carName, int inTime, int outTime) {
		this.carName= carName;
		this.inTime = inTime;
		this.outTime = outTime;
	}
	void print() {
		int fee = (outTime-inTime)*AMTPERTIME;
		System.out.println("차이름: "+carName);
		System.out.println("입고시간: "+inTime);
		System.out.println("출고시간: "+outTime);
		System.out.println("주차요금: "+fee);
	}
	 
	// 입차 출차 시간
	// 단가
	// 주차구역

}
public class V3_주자창Ex {

	public static void main(String[] args) {
		
		Parking p1 = new Parking("소나타",10,14);
		Parking p2 = new Parking("제네시스",15,20);
		Parking p3 = new Parking("벤츠",16,11);
		
		p1.print();
		p2.print();
		p3.print();
		
		

	}

}
