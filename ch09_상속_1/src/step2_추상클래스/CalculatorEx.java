package step2_추상클래스;


// 다시해보기
import java.util.Scanner;

abstract class Calculator1 {
	int num1;
	int num2;
	abstract void setValue(int num1, int num2);
	abstract int calculate();
}
class Add extends Calculator1 {

	@Override
	void setValue(int num1, int num2) {
		super.num1  = num1;                //super대신 this도 가능하다.
		super.num2  = num2;
	}

	@Override
	int calculate() {
		return num1+num2;
	}

}
class Sub extends Calculator1{

	@Override
	void setValue(int num1, int num2) {
		super.num1  = num1;
		super.num2  = num2;
	}

	@Override
	int calculate() {
		return num1-num2;
	}

	
}
class Mul extends Calculator1{

	@Override
	void setValue(int num1, int num2) {
		super.num1  = num1;
		super.num2  = num2;
	}

	@Override
	int calculate() {
		return num1*num2;
	}
	
}
class Div extends Calculator1{

	@Override
	void setValue(int num1, int num2) {
		super.num1  = num1;
		super.num2  = num2;
	}

	@Override
	int calculate() {
		return num1/num2;
	}
	
}

public class CalculatorEx {

	public static void main(String[] args) {
		
		Calculator1 add = new Add();
		Calculator1 sub = new Sub();
		Calculator1 mul = new Mul();
		Calculator1 div = new Div();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("계산하고 싶은 연산자선택(+,-,*,/)");
			String op = sc.next();
			
			System.out.println("두정수를 입력하시오");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			switch(op) {
			
			case "+" :
				add.setValue(x, y);
				add.calculate();
				System.out.println(x+"+"+y+"의 값은"+add.calculate());
				break;
			case "-" :
				sub.setValue(x, y);
				sub.calculate();
				System.out.println(x+"-"+y+"의 값은"+sub.calculate());
				break;
			case "*" :
				mul.setValue(x, y);
				mul.calculate();
				System.out.println(x+"*"+y+"의 값은"+mul.calculate());
				break;
			case "/" :
				div.setValue(x, y);
				div.calculate();
				System.out.println(x+"/"+y+"의 값은"+div.calculate());
				break;
			}
			sc.close();
		}
			}
	
		} 
