package step1_클래스와객체;

class Caculator {
	
	int num1, num2;
	
	void setNumber(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	int add() {
		int sum = 0;
		sum = num1 + num2;
		return sum;
	}
	int sub() {
		return num1-num2;
	}
	
	//곱하기
	int multiply() {
		return num1*num2;
	}
	//나누기
	double div() {
		return num1/num2;
	}
}

public class C4_CalculatorEx {
	public static void main(String[] args) {
		
		//객체생성
		Caculator cal1 = new Caculator();
		//num1, num2값 설정
		cal1.setNumber(10,9);
		
		//더하기
		System.out.println("10+9 = "+cal1.add());
		//빼기
		System.out.println("10-9 = "+cal1.sub());
		//곱하기
		System.out.println("10*9 = "+cal1.multiply());
		//나누기
		System.out.printf("10/9 =%f ",cal1.div());
		
		System.out.println();
		
		Caculator cal2 = new Caculator();
		
		cal2.setNumber(210,91);
		System.out.println("210+91 = "+cal2.add());
		
	}
}
